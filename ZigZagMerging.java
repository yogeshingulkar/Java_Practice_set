import java.util.Arrays;
class ZigZagMerging
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40};
		int [] b = {50,60,70,80,90,80,90};
		int size = (a.length )+ (b.length);
		int [] c = new int[size];

		System.out.println("Before : "+Arrays.toString(c));

		int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) 
        {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        
        while (i < a.length) 
        {
            c[k++] = a[i++];
        }
        
        while (j < b.length) 
        {
            c[k++] = b[j++];
        }
		System.out.println("After : "+Arrays.toString(c));

	}
}



// //merge one dimensional array in zigzag format
// import java.util.*;
// class Question11
// {
//  public static void main(String[] args)
//  {
//  int[] arr1 = {10,20,30,40,50};
//  int[] arr2 = {60,70,80};
//  System.out.println("First array : ");
//  for (int i : arr1)
//  {
//  System.out.print(i+" ");
//  }
//  System.out.println();
//  System.out.println("Second array : ");
//  for (int i : arr2)
//  {
//  System.out.print(i+" ");
//  }
//  int[] arr3 = new int[arr1.length+arr2.length];
//  System.out.println();
//  System.out.println("Third array before storing elements in zigzag : ");
//  for (int i : arr3)
//  {
//  System.out.print(i+" ");
//  }
//  System.out.println();

//  for(int i=0,cindex=0;i<arr1.length;i++) //using cindex we store elements
//  {
//  arr3[cindex++] = arr1[i]; //after every store cindex increaments by one
//  if(i<arr2.length)
//  arr3[cindex++] = arr2[i];
//  }
//  System.out.println("Third array after storing elements in zigzag : ");
//  for (int i : arr3)
//  {
//  System.out.print(i+" ");
//  }
//  }
// } 
