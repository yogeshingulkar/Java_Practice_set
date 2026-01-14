import java.util.Arrays;
class Marker{
	//Globle variable's
	//need to intiallized in future 
	String brand ;
	String color ;
	double price ;

	//constructor
	Marker(String brand, String color, double price){
		super();
		this.brand = brand ;
		this.color = color ;
		this.price = price ;
	}

	//toString() is from object class - it's one of the 11 non static methods from object class
	@Override //annotations
	public String toString(){
		return "Brand : "+ brand +", Color : "+ color + ", Price : "+ price ;
	}
}

class SampleExample{
	public static void main(String[] args) {

	Marker m1 =  new Marker("CAMLIN", "BLACK", 20.04);		
	Marker m2 =  new Marker("DOMS", "RED", 20.14);		
	Marker m3 =  new Marker("CAMLIN", "GREEN", 20.43);		
	Marker m4 =  new Marker("DOMS", "BLUE", 20.92);		

	Marker [] markers = {m1, m2 , m3, m4};

	for (Marker ele : markers) {
		System.out.println(ele);
		}
		
		for (; ; ) {
			System.out.println("\n1.Brand Ascending : ");
			System.out.println("2.Brand Descending : ");
			System.out.println("3.Color Ascending : ");
			System.out.println("4.Color Descending : ");
			System.out.println("5.Price Ascending : ");
			System.out.println("6.Price Descending : ");
			System.out.println("Enter your option : ");
			
			switch(new java.util.Scanner(System.in).nextInt()){
				case 1 -> brandAscending(markers, markers.length); 
				case 2 -> brandDescending(markers, markers.length); 
				case 3 -> colorAscending(markers, markers.length); 
				case 4 -> colorDescending(markers, markers.length); 
				case 5 -> priceAscending(markers, markers.length); 
				case 6 -> priceDescending(markers, markers.length); 
				default -> System.out.println("Invalid Input"); 
			}
			for (Marker ele : markers ) {
				System.out.println(ele);
			}
		}
	}
	public static void brandAscending(String [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(arr[i].brand.compareTo(arr[j].brand)>0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}

	public static void brandDescending(String [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(arr[i].brand.compareTo(arr[j].brand)<0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}

	public static void colorAscending(String [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(arr[i].color.compareTo(arr[j].color)>0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}

	public static void colorDescending(String [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(arr[i].color.compareTo(arr[j].color)<0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}

	public static void priceAscending(int [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(Double.compare(arr[i].price, arr[j].price)>0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}

	public static void priceDescending(int [] arr, int n ){
		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1 ;j<n ;j++ ) {
				if(Double.compare(arr[i].price, arr[j].price)<0){
					Marker temp = arr[i];
					arr[j] = arr[i];
					arr[j] = temp ;
				}
			}
		}
	}
}