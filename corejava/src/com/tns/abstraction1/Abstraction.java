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
		System.out.println("original size"+Originalsize+"mb");
		System.out.println("compressed size"+compressedsize+"mb");
		
		
	}
}
class Gzipfilecompressor extends Filecompressor{
	@Override
	void compress(String Compress) {
		System.out.println("compressing using zip");
		int Originalsize=100;
		int compressedsize=Originalsize*50/100;
		System.out.println("original size"+Originalsize+"mb");
		System.out.println("compressed size"+compressedsize+"mb");
		
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Zipfilecompressor z=new Zipfilecompressor();
		z.compress("project.zip");
		System.out.println();
		
		
		Gzipfilecompressor g=new Gzipfilecompressor();
        g.compress("project.gz");
        System.out.println();
	}

}


