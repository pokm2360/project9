package abstractex;

import java.util.ArrayList;

public class quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Animal2> list2 = new ArrayList<>();
		
		list2.add(new Human());
		list2.add(new Tiger());
		
		for(int i=0; i<list2.size(); i++) {
			Animal2 animal = list2.get(i); // 리스트에 저장된 요소 꺼내기
			
			animal.sleep();
			animal.move();
			
			if (animal instanceof Human) { // 실제 인스턴스의 타입 확인
				Human human = (Human) animal; // 다운캐스팅 (인스턴스 타입 확인을 안하면 에러!!)
				human.readBook(); // 버스가 가지고 있는 메소드 호출
				
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
		}
	}

}

