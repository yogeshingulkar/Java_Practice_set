import java.util.Arrays;
class PascleTriangle1{
	public static void main(String[] args) {
		int [] arr = {{1}{1,1}{1,2,1}{1,3,3,1}{1,4,6,4,1}};
		System.out.print(Arrays.toString(arr));
		int op = printPascalTriangle(i);
	}

	public static void printPascalTriangle(int numIs) {
        for (int i = 0; i < numIs; i++) {
            for (int space = 0; space < numIs - i - 1; space++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int col = 0; col <= i; col++) {
                System.out.print(number + " ");
                number = number * (i - col) / (col + 1);            }
            System.out.println();
        }
    }
}