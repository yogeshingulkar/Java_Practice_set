// class LengthVariable{
// 	public static void main(String[] args) {
		
// 		int [] arr = {10,20,30,40,50}; //object created
// 		int len = 0 ;
// 		for (int i = 0 ; ;i++) {
// 			try{
// 				int a = arr[i];
// 				len++;
// 			}catch(ArrayIndexOutOfBoundsException ae){
// 				break ;
// 			}
// 		}
// 		System.out.println("length : "+ len);
// 	}
// }


class LengthVariable{
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50}; //object created
		int len = 0 ;
		for (int ele :arr ) len++ ;
			System.out.println("length : "+ len);
	}
}


// class LengthVariable{
// 	public static void main(String[] args) {
		
// 	}
// }