class ArrayTraverse{
	public static void main(String[] args) {
		
		byte [] arr = {10,20,30,40,50,60,70,80};
		byte sum = 0 ;
		
		for (byte ele : arr){
				sum+=ele ;
		System.out.print(ele);
			}
		System.out.println(sum); //104
	}
}
