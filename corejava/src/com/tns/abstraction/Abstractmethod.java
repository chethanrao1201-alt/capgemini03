package com.tns.abstraction;

abstract class Delivery{
	abstract double calculatecharge(double distance);
	
	void showdeliverytype() {
		System.out.println("dekivey service selected");
	}
}

class Bikedelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
	
}

class Dronedelivery extends Delivery{
	@Override
	double calculatecharge(double distance){
		return distance*20;
	}
}




public class Abstractmethod {

	public static void main(String[] args) {
		Bikedelivery b=new Bikedelivery();
		System.out.println("bikedelivey :"+b.calculatecharge(5));
		
		Dronedelivery d=new Dronedelivery();
		System.out.println("bikedelivey :"+d.calculatecharge(10));
	}

}

