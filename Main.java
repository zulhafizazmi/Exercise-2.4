
public class Main {

	public static void main(String[] args) {

		Bicycle MountainBike = new Bicycle();
		
		MountainBike.setBrand("Santa Cruz");
		MountainBike.setType("Mountain Bike");
		MountainBike.setColour("Yellow");
		MountainBike.setWeight(13.2);
		
		System.out.println("Mountain Bike");
		System.out.println("Brand: " + MountainBike.getBrand());
		System.out.println("Type: " + MountainBike.getType());
		System.out.println("Colour: " + MountainBike.getColour());
		System.out.println("Weight: " + MountainBike.getWeight() + "kg");
		
		
		Bicycle ElectricBike = new Bicycle();
		
		ElectricBike.setBrand("Electron");
		ElectricBike.setType("Electric Bike");
		ElectricBike.setColour("Black");
		ElectricBike.setWeight(12.5);
		
		System.out.println("Electric Bike");
		System.out.println("Brand: " + ElectricBike.getBrand());
		System.out.println("Type: " + ElectricBike.getType());
		System.out.println("Colour: " + ElectricBike.getColour());
		System.out.println("Weight: " + ElectricBike.getWeight() + "kg");

	}

}
