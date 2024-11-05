package quiz.obj;

public class Wizard extends Player {
	
	public Wizard() {}
	public Wizard(String name, int hp,int mp) {
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	public Wizard(String name) {
		this(name, 1000,500);
	}
		
	void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	
	void Blizzard(Player players[]) {
			System.out.println("-----------------------");
			System.out.println(this.name+"님의 눈보라 시전!");
	
			//1.for문 사용(강화된 for문)
			for(Player play:players) {
				// 2.난수 생성
				int damage = (int)(Math.random()*6)+10;
				// 3. hp 감소
				play.hp-=damage;
				// 4. 감소내용출력
				System.out.println(play.name+"님이"+damage+"피해를 입엇습니다.");
			}
			

		
		
	}
	@Override
	void action() {
		System.out.println("마법사는 귀여운 동작을 합니다.");
	}
}
