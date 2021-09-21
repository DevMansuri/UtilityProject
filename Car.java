/**
*@Author : Nadim mansuri
*Date : 21/09/2021
*interface example.
**/
interface Car {

	public void runcar();
	public void blowhorn();
}
class Demo implements Car {
	public void runcar() {
		System.out.println("Run the car");
	}
	public void blowhorn() {
		System.out.println("please blow horn");
	}

}
class RunCar {
	public static void main(String[] args) {
		Car car = new Demo();
		car.runcar();
		car.blowhorn();
	}
}