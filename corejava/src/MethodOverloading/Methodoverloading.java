package MethodOverloading;

class Studentresult{
	void calculateresult(int math,int java,int dbms) {
		int total=math+java+dbms;
		System.out.println("total marks :"+total);
	}
	void calculateresult(int math,int python) {
		int total=math+python;
		System.out.println("total marks:"+total);
	}
	
	void calculateresult(int totalmarks,double bonus) {
	    double finalmarks=totalmarks+bonus;
		System.out.println("final marks:"+finalmarks);
	}
	
}

public class Methodoverloading {

	public static void main(String[] args) {
		Studentresult s=new Studentresult();
		s.calculateresult(70,60,80);
		s.calculateresult(50,90);
		s.calculateresult(240,0.5);
		
	}

}
