package test;
class Car {
String model;
String color;

Car(String model, String color) {
this.model = model;
this.color = color;
}

void start() {
System.out.println(model + " is starƟng.");
}

void stop() {
System.out.println(model + " is stopping.");
}
}
public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Toyota Corolla", "Red");
		System.out.println("Car Model: " + myCar.model);
		System.out.println("Car Color: " + myCar.color);
		myCar.start();

		myCar.stop();
	}

}
