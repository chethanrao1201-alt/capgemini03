package com.example.Placementcertificate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Placementcertificate.entity.Certificate;
import com.example.Placementcertificate.service.CertificateService;

@RestController
public class CertificateController {
	@Autowired
	private CertificateService cs;

	@PostMapping("/savecertificate")
	public Certificate registerCertificate(@RequestBody Certificate c) {
		return cs.registerCertificate(c);
	}

	@GetMapping("/getcertificate")
	public List<Certificate> getCertificates() {
		return cs.getCertificates();
	}

	@PutMapping("/updatecertificate/{id}")
	public Certificate updateCertificate(@PathVariable("id") Long id, @RequestBody Certificate c) {
		return cs.updateCertificate(id, c);
	}

	@DeleteMapping("/deletecertificate/{id}")
	public void deleteCertificate(@PathVariable("id") Long id) {
		cs.deleteCertificate(id);
	}
}
