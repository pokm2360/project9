package abstractex;

public class quiz2 {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();
		System.out.println();
		
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();
		
	}

}

abstract class Car2 {
//	자동차가 달리고, 기름넣는 기능은 모든 자동차가 가지고 있지만, 자식마다 동작방식이 다름
	public abstract void run();
	
	public abstract void refuel();
}

class Bus extends Car2 { // 상속받기

	@Override
	public void run() { // 물려받은 추상메소드 구현
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}
	
	// 버스에 승객을 태우는 기능은 버스만 사용
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}

class AutoCar extends Car2 {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}