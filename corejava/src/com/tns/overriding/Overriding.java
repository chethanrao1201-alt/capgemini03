package com.tns.overriding;

class Bankaccount {
	void calculateintrest(double amount) {
		System.out.println("calculate the standard bank account");
		System.out.println("Amount:"+amount);
	}
}

class Savingaccount extends Bankaccount {
	@Override
	void calculateintrest(double amount) {
		double intrest=amount*0.04;
	
		System.out.println("savings account");
		System.out.println("principalAmount:"+amount);
		System.out.println("intrest:"+intrest);
	}
}

class Fixeddeposit extends Bankaccount{
	@Override
	void calculateintrest(double amount) {
		double intrest=amount*0.007;
		System.out.println("fixed deposit");
		System.out.println("principal:"+amount);
		System.out.println("intrest:"+amount);
	}
}

class Currentaccount extends Bankaccount {
	@Override
	void calculateintrest(double amount) {
		System.out.println("current account");
		System.out.println("no intrest provided");
	}
	
}


public class Overriding {

	public static void main(String[] args) {
		Bankaccount a;
		a=new Savingaccount();
		a.calculateintrest(100000);
		System.out.println();
		
		a=new Fixeddeposit();
		a.calculateintrest(100000);
		System.out.println();
		
		a=new Currentaccount();
		a.calculateintrest(100000);
		

	}

}
