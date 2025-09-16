//Question 3.)  
//You are developing a Java application for managing vehicles in a rental service. Create a class  named Vehicle
//with attributes for make, model, and year. Implement a constructor that initializes  these fields. 
//Next, design a subclass named Car with an additional attribute for numberOfDoors.  
//Provide two constructors for the Car class: one that accepts all fields including make, model,  year, and numberOfDoors,
//and another that accepts only make and model, chaining to the  superclass constructor. Validate the input in each constructor and provide 
//appropriate getter and  setter methods to access and modify the attributes of the Vehicle class. Ensure proper usage of  inheritance principles. 

class Vehicles{
	private String make;
	private String model;
	private int year;

	Vehicles(String make ,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}


class Car extends Vehicles{
	int numberOfDoors;

	Car(String make, String model, int year,int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors=numberOfDoors;
	}
	Car(String make,String model){
		this(make,model,2003,4);
	}

}
public class vehicleRental {

	public static void main(String[] args) {
		Vehicles c =new Car("porsche","gt3rs",2023,2);
		System.out.println("make: "+c.getMake()+"year "+c.getYear());

	}

}
