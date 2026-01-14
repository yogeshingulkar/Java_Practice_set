import java.util.Arrays;
class Demo 
{
    public static void main(String[] args) 
    {
    	System.out.println("main Ends");

        // short [][][] a = new short[4][2][1]; // size 3 in first dimension

        // a[0] = new short[0][1];
        // a[1] = new short[2][2];
        // a[2] = new short[3][3];

        // System.out.println("Length of a : " + a.length);

        // System.out.println(Arrays.deepToString(a));
        // System.out.println(Arrays.toString(a));


    	// int [][] a = new int[3][];
    		// a[0] = new int [];

    	// int[] a = {10, 20, 30};
		// int[] b = a.clone();

		// System.out.println(Arrays.toString(b));
		// System.out.println("Hash Code a : "+b.hashCode());
		// System.out.println("Hash Code b : "+a.hashCode());

		// // System.out.println(Arrays.deepToString(b));
    
		// int [] arr = {10,20,30,40};
		// System.out.println(Arrays.toString(arr));
		// // System.out.println(Arrays.deepToString());
		// System.out.println("Hash Code arr : "+Arrays.hashCode(arr));

		// int [][][] arr = {{{10,20,90,90,90},{30,40},{50,60}},{{1,0,90,90,80,70,2},{3,4},{5,6}}};
		// System.out.println(Arrays.deepToString(arr));

    	// int[] arr = new int[5]; arr[0] = 10; arr[1] = 10; arr[2] = 10; arr
    	
    	// [3] = 10; arr[4] = 10;
    	
    	// System.out.println(Arrays.toString(arr));
    	// System.out.println(Arrays.hashCode(arr));


    	byte [][] a = new byte[2][3];
    	a[0][0] = 10 ;
    	a[0][1] = 10 ;
    	a[0][2] = 10 ;

    	a[1][0] = 10 ;
    	a[1][1] = 10 ;
    	a[1][2] = 10 ;
    	// a[2][0]=20 ; //! Not possible At all.

    	int [][] b = {{10,10,10},{10,10,40}};
    	int [][] c = b.clone();
    	
    	System.out.println(Arrays.deepToString(a));
    	System.out.println(a);
    	System.out.println("--------------------");
    	System.out.println(Arrays.deepToString(b));
    	System.out.println(b);
    	System.out.println("--------------------");
    	System.out.println(Arrays.deepToString(c));
    	System.out.println(c);
    	System.out.println("--------------------");

    	byte [][][] bigArray = {{{10,10,101,101,01,01,01,01,01,010,10,
    	101,01,010,01,01,01,0,10}}};
    	System.out.println(Arrays.deepToString(bigArray));
    	System.out.println(bigArray);
    	System.out.println("--------------------");

    	System.out.println("main Ends");
    }
}
