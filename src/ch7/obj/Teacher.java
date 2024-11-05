package ch7.obj;

public class Teacher extends Person {
	
	public String subject;
	
	public Teacher() {}
	
	public Teacher(String name, int age, String subString) {
		super(name,age);
		this.subject = subString;
	}
	
	public Teacher(String name, int age) {
		this(name, age, "프로그래밍");
	}
	
	@Override
	public String info() {
		
		return "이름 : " + name + ", 나이 : " + age + ", 과목 : " + subject;
	}
	
}
