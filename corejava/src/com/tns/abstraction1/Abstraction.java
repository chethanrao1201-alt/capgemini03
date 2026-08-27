package com.tns.abstraction1;


abstract class Filecompressor{
	abstract void compress(String Compress);
	
	void Showdetails() {
		System.out.println("compress started");
	}
	
}

class Zipfilecompressor extends Filecompressor{

	@Override
	void compress(String Compess) {
		System.out.println("compresson using Zip.....");
		int Originalsize=100;
		int compressedsize=Originalsize*50/100;
		System.out.println("original size"+Originalsize);
		System.out.println("compressed size"+compressedsize);
		
		
	}
}
class Gzipfilecompressor extends Filecompressor{
	@Override
	void compress(String Compress) {
		// TODO Auto-generated method stub
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


