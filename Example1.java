// class Example1 {
//     public static void main(String[] args) {

//         int [][] arr = {{10,20,30},{40,50},{60,70,80}};

//         // USING FOR LOOP
//         for (int a = 0; a < arr.length; a++) {
//             for (int b = 0; b < arr[a].length; b++) {
//                 System.out.print(arr[a][b] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println();
//         System.out.println("-------------------");
//         System.out.println();

//         // USING WHILE LOOP
//         int i = 0;
//         while(i < arr.length) {
//             int j = 0;
//             while(j < arr[i].length) {
//                 System.out.print(arr[i][j] + " ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//         System.out.println();
//         System.out.println("-------------------");
//         System.out.println();

//         // USING DO-WHILE LOOP
//         i = 0;
//         do {
//             int j = 0;
//             do {
//                 System.out.print(arr[i][j] + " ");
//                 j++;
//             } while(j < arr[i].length);
//             System.out.println();
//             i++;
//         } while(i < arr.length);
        
//     }
// }


class Example1{
	public static void main(String[] args) {
		
		int [][] arr = {{10,20,30},{40,50},{60,70,80,90}};

		for (int [] arr1 : arr)
		{
			for (int ele : arr1)
			 {
				System.out.print(ele+);
			}
			System.out.println();
		}

	}
}