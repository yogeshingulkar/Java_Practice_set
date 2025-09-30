class Address
{
	String locality ;
	String area ;
	String city ;
	String state ;
	int pincode ;

	Address(String locality, String area, String city,
	 String state, int pincode){
		super();
		this.locality = locality ;
		this.area = area ;
		this.city = city ;
		this.state = state ;
		this.pincode = pincode ;
	}

	public void displayAddress(){
		System.out.println("\n ADDRESS DETAILS \n");
		System.out.println("Locality : "+locality );
		System.out.println("Area : "+ area );
		System.out.println("City : "+ city );
		System.out.println("Pincode : "+ pincode );
	}
}
class Card
{
	String bank ;
	String expiryDate ;
	int cvv ;
	long cardNumber ;

	Card(String bank, String expiryDate, int cvv, long cardNumber)
	{
		super();
		this.bank = bank;
		this.expiryDate = expiryDate ;
		this.cvv = cvv ;
		this.cardNumber = cardNumber ;
	}

	public void displayCard(){
		System.out.println("\n CARD DETAILS");
		System.out.println("Bank : "+bank);
		System.out.println("Expiry Date : "+ expiryDate);
		System.out.println("CVV Number : "+ cvv);
		System.out.println("Card Number : "+ cardNumber);
	}
}
class Customer
{
	String name ;
	String email ;
	long contact ;
	Address [] addresses ;
	Card card ;

	Customer(String name, String email, long contact, 
		Address [] addresses, Card card)
	{
		super();
		this.name = name ;
		this.email = email ;
		this.contact = contact ;
		this.addresses = addresses ;
		this.card = card ;
	}
	public void displayCustomer(){
		System.out.println("\n CUSTOMER DETAILS \n");
		System.out.println("Name : "+ name);
		System.out.println("Email : "+ email);
		System.out.println("Contact : "+ contact );
	}
}
class CompositionDriver
{
	public static void main(String[] args) 
	{
		Address address1 = new Address("JM ROAD", "DECCAN", "PUNE", "MH", 411005);
		Address address2 = new Address("Bharati Vidyapeeth", "Katraj", "Pune", "MH", 411043);

		Card card = new Card ("SBI","07/28",453,1234_1234_1234_1234l);

		Customer customer = new Customer("Ramesh Kumar", "ramesh@gmail.com", 
			987654320l, new Address[]{address1, address2},card);		
			
		customer.displayCustomer();
		customer.card.displayCard();
		Address [] arr = customer.addresses;
		for (Address ele : arr) 
		{
			ele.displayAddress();		
		}	
	}
}

