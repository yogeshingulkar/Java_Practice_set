class ReverseNumber123{

	public int reverseNumber(int x)
	{		
		int rev = 0; //initiallization
		while(x != 0){  //condition
			rev = rev * 10 + (x%10); //rev Number Logic
			rev /= 10; 
		}
			if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
				return rev;
	}
}

// op : RTE -> main() not found