package practice;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum =0;
		
		while(i<100){
			if(i%3==0) {
				sum=sum+i;
				
			}
			i++;
		}
		
		System.out.println("1~100까지 3의 배수의 합:"+sum);
	}

}
