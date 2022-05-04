//package LabExam;

public class RaceTrack {
	public static void main(String[] args) {
	
	Car car = new Car(2022, "XUV300", 120);
		
		System.out.println("****current status****");
		
		System.out.println("Car Year : "+car.getYear());
		System.out.println("Car Make : "+ car.getMake());
		System.out.println("Car Speed : "+car.getSpeed());

	
	car.accelerate();

		System.out.println("****After Accelerating****");

		System.out.println("Car Year : "+ car.getYear());
		System.out.println("Car Make : "+ car.getMake());
		System.out.println("Car Speed : "+ car.getSpeed());
	}

}
