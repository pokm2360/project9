package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog(); //부모로 형변환
		animal1.breathe();
		animal1.sound(); // 재정의된 메소드가 호출됨
		
		Animal animal2 = new Cat();
		animal2.breathe();
		animal2.sound();
	}

}

abstract class Animal {
	
//	 공통 기능은 일반메소드로 선언
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	동물마다 내는 소리가 다르므로 추상메소드로 선언
	public abstract void sound();
}

//고양이 클래스
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}