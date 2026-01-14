import java.util.*;
class ArrayExample
{
	public static void main(String[] args)
	{
		String [] names = {"Yogesh" , "Ingulkar"};
		m1();
		System.out.println(Arrays.toString(names));
 	}
 	
 	public static void m1()
 	{
 		String[] names = {"Yogesh"};
 		for (String ele : names ) {
 			System.out.println(ele + " ");
 		}
 	}
}