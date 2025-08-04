class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
            Thread.sleep(200); // 200 milliseconds delay
        }

        System.out.println();
    }
}
