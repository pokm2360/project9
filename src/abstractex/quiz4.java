package abstractex;

import java.util.ArrayList;

public class quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Car2> list = new ArrayList<>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for(int i=0; i<list.size(); i++) {
			Car2 car = list.get(i); // 리스트에 저장된 요소 꺼내기
			
			car.run();
			car.refuel();
			
			if (car instanceof Bus) { // 실제 인스턴스의 타입 확인
				Bus bus = (Bus) car; // 다운캐스팅 (인스턴스 타입 확인을 안하면 에러!!)
				bus.takePassenger(); // 버스가 가지고 있는 메소드 호출
				
			} else if (car instanceof AutoCar) {
				AutoCar autocar = (AutoCar) car;
				autocar.load();
			}
		}
	}

}

