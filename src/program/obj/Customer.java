package program.obj;

public class Customer {
	
	// 필드 
	public String name;
	public String gender;
	public String email;
	public int birth;
	
	
	// 생성자
	// 생략(기본 생성자 -> Customer() {};)
	public Customer () {}
	
	public Customer (String name,String gender,String email, int birth) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birth = birth;
	}
	
	
	
	
	// getter, setter 

	
	// 메서드
	@Override // 재정의
	public String toString() {
		// toString()은 Object클래스에서 정의한 메서드
		return "[이름 = "+ name +", 성별 = " + gender + " , 이메일 = " + email + ", 출생년도 : "+birth + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBirth() {
		return birth;
	}


	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	
	
	
	
	
	
	
	
	
	

}
