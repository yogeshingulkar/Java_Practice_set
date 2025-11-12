package Practice;
import java.util.Objects;

class Vehicle{
	String model;
	String brand ;
	double price ;
	int tyres;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String model, String brand, double price, int tyres) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.tyres = tyres;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, price, tyres);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && tyres == other.tyres;
	}
}
public class Car {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("SAFARI","TATA",3000000.0,4);
		Vehicle v2 = new Vehicle("SAFARI","TATA",3000000.0,4);
		Vehicle v3 = new Vehicle("PUNCH","TATA",2500000.0,4);

		System.out.println(v1.equals(v1));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v1==v2);
		
		System.out.println(v3);
		
	}
}
