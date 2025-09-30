import java.util.Scanner;
import java.util.ArrayList ;

class Driver
	{
		private String name ;
		private long contact ; 

		Driver(String name, long contact){
			this.name = name ;
			this.contact = contact ;
		}

		public void getDriver(){
			System.out.println("\n   Driver Information ");
			System.out.println("Driver : " + name);
			System.out.println("Contact : "+ contact + "\n");
		}
	}
class Cab{
		static int id = 3456 ;
		private Driver driver ;
		private String number ;
		private String uberId ;
		private String type ;
		private int capacity ;
		private String status  = "Available" ;
		private String location = "DECCAN" ;

		String [] typeVehicle = {"hatchback","sedan","suv","muv"} ;
		int [] vehicleCapacity = {3,4,5,6} ;

			{
				this.uberId = "UBER" + id++ ;
			}

			Cab(String number, String type, Driver driver){
				this.number = number ;
				this.type = type.toLowerCase();

				int indx = 0 ;
				for (String element : typeVehicle) {
					if (type.toLowerCase().equals(element)) {
						break;
					}
					indx++;
				}
				this.capacity = vehicleCapacity[indx];
				this.driver = driver ; //this keyword is writtern only for understanding

			}
			public void getCabDetails(){
				System.out.println("\n CAB DETAILS ");
				System.out.println("Uber Id : "+ uberId);
				System.out.println("Status : " + status);
				System.out.println("Type : "+ type);
				System.out.println("Capacity : "+capacity);
				System.out.println("Location : "+ location);
				System.out.println("");
			}

			public String getCabNumber(){
				return number ;
			}
			public Driver getDriver(){
				return driver ;
			}
			public String getStatus(){
				return status ;
			}
			public void setStatus(String newStatus){
				this.status = newStatus ;
			}
			public int getCapacity(){
				return capacity ;
			}
			public String getUberId(){
				return uberId ;
			}
	}
class UberDriver
	{
		public static void main(String[] args) 
		{
			Uber uber = new Uber();
			uber.homeModule();
		}
	}
	class Passenger{
		private String name ; //getter setter
		private long contact ; //getter setter
		private String email ; //getter setter
		private String pickupLocation ; //getter setter
		private String dropLocation ; //get set
		private int seats ; //getter() setter()

		Passenger(String name, long contact, 
			String email, String pickupLocation, 
			String dropLocation,int seats)
		{
				super();
				this.name = name ;
				this.contact = contact ;
				this.email = email ;
				this.pickupLocation = pickupLocation ;
				this.dropLocation = dropLocation ;
				this.seats = seats;
		}

		//set get : name
		public String getName(){
			return name ;
		}
		public void setName(String newName){
			this.name = newName ;
		}

		//set get : contact
		public long getContact(){
			return contact ;
		}
		public void setContact(long newContact){
			this.contact = newContact ; 
		}

		//get set : email
		public String getEmail(){
			return this.email ;
		}
		public void setEmail(String newEmail){
			this.email = newEmail ;
		}

		//get set : pickupLocatiom
		public String getPickupLocation(){
			return pickupLocation ;
		}
		public void setPickupLocation(String newPickupLocation){
			this.pickupLocation = newPickupLocation ;
		}

		//get set : dropLocation
		public String getDropLocation(){
			return dropLocation ; 
		}
		public void setDropLocation(String newDropLocation){
			this.dropLocation = newDropLocation ;
		}

		//get() set() : Seats
		public int getSeats(){
			return this.seats ;
		}
		public void setSeats(int newSeats){
			this.seats = newSeats ;
		}
	}
	class Uber
	{
		String [] stops = {"DECCAN","SHIVAJINAGAR","SANGAMWADI","YERWADA"};
		int [] distances = {0,2,4,7,9};
		ArrayList<Cab> listCabs = new ArrayList<Cab>();
		Passenger passenger ;
		Cab currentCab ;
		{
			addPassenger();
		}

		//non-static block - cab details list
		{
			Cab cab1 = new Cab("MH-12-AB-8108","sedan",new Driver("Ramesh Kumar",9888843210l));
			Cab cab2 = new Cab("MH-13-AB-8199","suv",new Driver("Ganesh Kumar",888543210l));
			Cab cab3 = new Cab("MH-14-AB-8199","hatchback",new Driver("Mahesh Kumar",9333543210l));
			Cab cab4 = new Cab("MH-15-AB-8199","muv",new Driver("Mitesh Kumar",9678543210l));
			Cab cab5 = new Cab("MH-17-AB-8199","sedan",new Driver("Manish Kumar",7876543210l));
			Cab cab6 = new Cab("MH-19-AB-8199","hatchback",new Driver("Rajesh Kumar",7776543210l));
			listCabs.add(cab1);
			listCabs.add(cab2);
			listCabs.add(cab3);
			listCabs.add(cab4);
			listCabs.add(cab5);
			listCabs.add(cab6);
		}

		public void addPassenger(){
			System.out.println("Passenger details");
			System.out.print("Name : ");
			String name  = new Scanner(System.in).nextLine();
			System.out.print("Contact : ");
			long contact = new Scanner(System.in).nextLong();
			System.out.print("Email : ");
			String email = new Scanner(System.in).next();
			System.out.print("Pickup Location : ");
			String pickup = new Scanner(System.in).nextLine();
			System.out.print("Drop Location : ");
			String drop = new Scanner(System.in).nextLine();
			System.out.print("Number of Seats : ");
			int seats = new Scanner(System.in).nextInt();

			this.passenger = new Passenger(name, contact, email, pickup, drop, seats);
		}

		public void homeModule(){
			for (; ; ) {
				System.out.println("\n WEL-COME \n");
				System.out.println("1. BOOK A RIDE ");
				System.out.println("2. CANCEL A RIDE ");
				System.out.println("3. RIDE HISTORY ");
				System.out.println("4. LOG-OUT \n");
				System.out.println("Enter your Response : ");
				int response = new Scanner(System.in).nextInt();

				switch(response){
				case 1 -> bookRide();
				case 2 -> cancelRide();
				case 3 -> rideHistory();
				case 4 -> {
					System.out.println("THANK YOU FOR USING UBER");
					System.exit(0);
				}
				default -> System.out.println("INVALID RESPONSE"); //continue - wapas jaao  
				}

			}
		}
		public void bookRide(){
			if(passenger==null){
				addPassenger();
			}

			System.out.println("\n BOOK-A-RIDE MODULE");
			for (Cab element : listCabs) 
			{
				if (element.getStatus().equals("Available") 
					&& passenger.getSeats()<=element.getCapacity()){
					element.getCabDetails();
			}}
			System.out.print("\n Enter a Uber ID : ");
			String uberId = new Scanner(System.in).next();
			boolean assump = false;
			for (Cab ele : listCabs ) {
				if (ele.getUberId().equals(uberId)){
					System.out.println("Your Ride Has Been Confirmed!!");
					currentCab = ele ;
					assump = true ;
					System.out.println("Your Ride Details");
					ele.getCabDetails();
					System.out.println("Cab Number : " + ele.getCabNumber());
					ele.getDriver().getDriver();
					double fare = calculateFare(passenger.getPickupLocation(),passenger.getDropLocation());
					System.out.println("Pickup : "+ passenger.getPickupLocation());
					System.out.println("Drop : "+ passenger.getDropLocation());
					System.out.println("\n Fare is : "+ fare+" .Rs \n");
					break;
				}//if ends
			}//for-each loop ends
				
				if(!assump)
				System.out.println("\n Invalid Uber ID \n");	
		}

		public double calculateFare(String pickup, String drop){
			double fare = 0 ;
			int pickupIndex = -1 ;
			int dropIndex = -1 ;
			int indx = 0 ;
			for (String point: stops ) {
					if (pickup.equals(point)) {
							pickupIndex = indx ;
						}			
							if (drop.equals(point)) {
								dropIndex = indx ;
							}
						indx++;
			}

			fare = (distances[dropIndex]-distances[pickupIndex])*30;
			return fare ;
		}

		public void cancelRide(){

		if(currentCab==null){
			System.out.println("\n No Ride has Been Booked!! \n");
			return ;
		}
		System.out.println("\n Cancel-a-Ride Module \n ");
		System.out.println("Your Ride Details");
		currentCab.getCabDetails();
		System.out.println("Cab Number : "+currentCab.getCabNumber());
		currentCab.getDriver().getDriver();

		System.out.println("DO U WANT TO CANCEL YOUR RIDE (YES/NO) : ");
		String resp = new Scanner(System.in).next();
		if(resp.equalsIgnoreCase("YES")){
			System.out.println("Your Ride has been cancelled");
			currentCab = null;
			passenger = null ;
		}
	}

		public void rideHistory(){
			System.out.println("\n Ride History \n ");

		}
	}

