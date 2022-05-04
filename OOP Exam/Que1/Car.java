//package LabExam;

public class Car {
	private int year ;
	private String make;
	private int speed;

	//constructor
	public Car (int year, String make, int speed) {
		super();
		this.year = year;
		this.make = make;
		this.speed = speed;
	}

	//Getter Methods
	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	public void accelerate() {
		this.speed += 1;
		
	}

}