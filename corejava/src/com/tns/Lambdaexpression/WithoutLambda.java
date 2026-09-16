package com.tns.Lambdaexpression;


@FunctionalInterface
interface Drawable{
	public void Draw();
}
class Test implements Drawable{
	int width=20;
	@Override
	public void Draw() {
		System.out.println("drawing :"+width);
		}
	
}

public class WithoutLambda {
public static void main(String[] args) {
		Drawable d=new Test();
		d.Draw();
	}

}
