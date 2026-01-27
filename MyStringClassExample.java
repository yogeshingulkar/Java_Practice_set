import java.io.Serializable;

class MyArrayIndexOutOfBoundsException extends RuntimeException{
	public MyArrayIndexOutOfBoundsException(String description){
		super(description);
	}
}

public final class UserString1{
	private char[] arr ;
	private int indx = 0 ;
	
	public UserString1(){
		arr = new char[0];
	}

	public UserString1(StringBuilder sb){
		this(sb.toString());
	}

	public UserString1(StringBuffer sb){
		this(sb.tosString());
	}

	public UserString1(byte[] arr){
		this(arr,0,arr.length);
	}

	public UserString1(byte[] arr, int offset, int count){
		
		if(offset + count > arr.length){
			throw new MyArrayIndexOutOfBoundsException("Index out of Bounds")
		}

		this.arr = new char[count];
		for (int i = offset ,j=0; i<offset+count; i++){
		this.arr[j++] = (char)arr[i];
		}
	}

	public UserString1(char[] arr, int offset, int count){
		
		if(offset + count > arr.length){
			throw new MyArrayIndexOutOfBoundsException("Index out of Bounds")
		}

		this.arr = new char[count];
		for (int i = offset ,j=0; i<offset+count; i++){
		this.arr[j++] = arr[i];
		}
	}

	public UserString1(int[] arr, int offset, int count){
		
		if(offset + count > arr.length){
			throw new MyArrayIndexOutOfBoundsException("Index out of Bounds")
		}

		this.arr = new char[count];
		for (int i = offset ,j=0; i<offset+count; i++){
		this.arr[j++] = (char)arr[i];
		}
	}

	public UserString1(char[] arr){
		this(arr,0,arr.length);
	}

	public int length(){
		return arr.length;
	}

	@Override
	public String toString(){
		if(arr.length == 0)
			return "";
		
		String output = "";
		for (char ele : arr ) {
			output += ele ;
		}
		return output ;
		}
}
class MyStringClassExample{
	public static void main(String[] args) {
		 UserString1 us1 = new UserString1("Hello");
		 System.out.println(us1);
		 System.out.println("Length : "+ us1.length());

		 byte[] data = {65,66,67,68,69};
		 UserString1 us2 = new UserString1(data,1, 3);
		 System.out.println(us2);

		 char[] ch = {'J','A','V','A'};
		 UserString1 us3 = new UserString1(ch);
		 System.out.println(us3);
	}
}
