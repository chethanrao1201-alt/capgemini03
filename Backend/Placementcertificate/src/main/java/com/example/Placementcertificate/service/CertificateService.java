package com.example.Placementcertificate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Placementcertificate.entity.Certificate;
import com.example.Placementcertificate.repository.CertificateRepo;

@Service
public class CertificateService {
	@Autowired
	private CertificateRepo cr;

	// create
	public Certificate registerCertificate(Certificate c) {
		return cr.save(c);
	}

	// read
	public List<Certificate> getCertificates() {
		return (List<Certificate>) cr.findAll();
	}

	// update
	public Certificate updateCertificate(Long id, Certificate c) {
		Certificate existing = cr.findById(id).orElse(null);

		if (existing == null) {
			return null; // no record with this id
		}

		existing.setYear(c.getYear());
		existing.setCollege(c.getCollege());
		return cr.save(existing);
	}

	// delete
	public void deleteCertificate(Long id) {
		cr.deleteById(id);
	}
}
