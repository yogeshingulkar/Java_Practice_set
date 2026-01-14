class PascleTriangle {
    public static void main(String[] args) {
        int numRows = 5; // You can change this value to generate more or fewer rows
        printPascalTriangle(numRows);
    }

    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            for (int space = 0; space < numRows - row - 1; space++) {
                System.out.print(" ");
            }
            int number = 1; // First number in each row is always 1
            for (int col = 0; col <= row; col++) {
                System.out.print(number + " ");
                number = number * (row - col) / (col + 1); // Calculate next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}