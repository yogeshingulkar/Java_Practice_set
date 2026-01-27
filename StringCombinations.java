class StringCombinations{
	public static void main(String[] args) {
		
		String str = "abcd";
		// combination1(str);
		combination2(str);

	}
	
	// abc acb bca bac cab cba
	public static void combination1(String str){
		for (int i = 0; i < str.length(); i++) {
			String str1 = "";
			for (int j = i; j < str.length(); j++) {
				str1 = str1 + str.charAt(j);
				System.out.println(str1);n
			}
		}
	}

	//a ab abc ac acb b ba bac bc bca c cb cba ca cab 
	public static void combination2(String str){
		for (int i = 0; i < str.length(); i++) {
			String str1 = "";
			for (int j = i; j < str.length(); j++	) {
				str1 += str.charAt(j);
				System.out.println(str1);
			}
		}
	}
}