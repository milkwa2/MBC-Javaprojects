package ch6.obj;

public class Person {

	public String name;
	public int age;
	public double tall;
	
	public void info() {
		System.out.println(name);
		System.out.println(age+" 살");
		System.out.println("키 : "+tall+"cm ");
	}
}
