class Engine{

	String type ;
	String transmission ;
	int pistons ;
	double bhp ;
	double capacity ;
	int gears ;

	Engine(String type, String transmission, int pistons, 
		double bhp, double capacity, int gears){
		super();
		this.type = type ;
		this.transmission = transmission ;
		this.pistons = pistons ;
		this.capacity = capacity ;
		this.gears = gears ;
	}
	public void displayEngine(){
		System.out.print("\n Engine Details \n ");
		System.out.println("Type : "+ type );
		System.out.println("Transmission : "+ transmission );
		System.out.println("pistons : "+ pistons);
		System.out.println("BHP : "+ bhp);
		System.out.print("Capacity : "+ capacity );
		System.out.println("gears : "+ gears);
	}

	public void startEngine(){
		System.out.println("\n Engine Has Started");
	}
}
class Car {
	String brand ;
	String model;
	String color ;
	double price ;
	Engine engine ;

	Car(String model, String brand, String color, double price){
		this.brand = brand ;
		this.model = model ;
		this.color = color ;
		this.price = price ;
		this.engine = new Engine("Petrol", "Manual", 4, 450, 2500, 6);
	}
	public void displayCar(){
		System.out.println("\n CAR DETAILS");
		System.out.println("Brand : "+ brand);
		System.out.println("Model : "+ model);
		System.out.println("Color : "+ color);
		System.out.println("Price : "+ price);
	}
}
class CompositionDriverExample
{
	public static void main(String[] args) 
	{
		Car object = new Car("Fortuner", "Toyota", "Black", 5000000);
		object.displayCar();
		object.engine.displayEngine();
		object.engine.startEngine();
	}
}