import java.util.Arrays;
class Vowelconsonant{
	public static void main(String[] args) {

for (int i = 0 ;i<20 ;i++) {
			char ch = (char)(Math.random()*100);

			if (!(ch>65 && ch<=90)) 
			{
				i--;
				continue;
			}
			char arr[i] = ch;
		}	
		System.out.println(Arrays.toString(arr));

		int vowel = 0, consonant = 0 ;

		for (char ele : arr)
		{
			if (ele == 'A' || ele =='E'|| ele =='I'|| ele =='O'|| ele =='U') vowel++;
			else consonant++;
		}

		char [] vowel = new char[vowel];
		char [] consonant = new char[consonant];

		int i = 0 , j = 0 ;
		for (char ele : arr){
			if (ele=='A' || ele=='E' || ele=='I'|| ele=='O' || ele=='U') vowel[i++] = ele;
			else consonant[j++] = ele;
		 	
		 } 
		 System.out.println("Vowel : " + Arrays.toString(vowel));
		 System.out.println("Consonant : " + Arrays.toString(consonant));

	}
}