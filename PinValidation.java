import java.util.Scanner; //import the Scanner class to take an input from the user
import static java.lang.System.*; //this is the System package which is imported for concise code

class PinValidation { //class name
    public static void main(String[] args) 
    throws InterruptedException {  //we use throws interruptedexception- because Another thread cannot be interrupt the main thread. 
        int storePin = 1234;   //this is the default pin
        int duration = 5000; //this is the duration of the thread sleep (32 Line)

        outerLoop: //this is label of Outloop 
        for (;;) {  //for loop started
            int attempt = 3; //initially we have 3 attempts

            //do-while loop starts
            do {
                out.println(); //skips System Class (ref.Line 02)
                out.print("Enter your pin: ");
                int userPin = new Scanner(System.in).nextInt(); //Scanner Statement

                    //if-else loop starts
                if (storePin == userPin) { //to check the default pin is same as user entered pin
                    out.println("PHONE UNLOCKED");
                    break outerLoop; //break outloop using the label (ref.Line 10)
                } else {
                    out.println("Wrong Pin");
                    out.println("Attempt left: " + (attempt - 1)); //Attempt(3-1)
                }

                attempt--; // updation - attempt should be decreased by one

            } while (attempt != 0); // condition of do-while

            out.println();
            out.println("Phone is Disabled for " + (duration / 1000) + " seconds"); 
            //converted Milliseconds into seconds(duration/1000) with this
            Thread.sleep(duration); //duration (8)
            duration *= 2; //duration will be increased 2 times
        }
    }
}
