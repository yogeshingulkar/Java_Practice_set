import java.util.Scanner ;
class PassAndFail
{
    public static void main(String [] args)
    {
	Scanner sc = new Scanner(System.in) ;
	System.out.print("Enter the Grade : ") ;
	char grade = sc.next().toUpperCase().charAt(0) ;
	
	if(!(grade>='A' && grade<='F'))
	{
	    System.out.print("INVALID GRADE") ;
	    return ;
	}

	//Fall Through Statement	
	switch(grade)
	{
	    case 'A' : 
  	    case 'B' :
	    case 'C' : System.out.println("Passed :"+ grade) ; break ;
	    case 'D' :
	    case 'E' : System.out.println("Retest :"+ grade) ; break ;
	    case 'F' : System.out.println("Failed :"+ grade) ; break ;
	}
    }
}

	

	
	