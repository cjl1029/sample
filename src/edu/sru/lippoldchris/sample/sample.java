package edu.sru.lippoldchris.sample;

public class sample {
	private int a;
	private int b;
	
	void a(int a)
	{
		this.a = a;
	}
	
	void b(int b)
	{
		this.setB(b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void printA(int a)
	{
		System.out.println(a);
		
	}
	
	public void printB(int b)
	{
		System.out.print(b);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
