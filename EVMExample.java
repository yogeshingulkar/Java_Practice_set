import java.util.Scanner;

class EVMExample {
    // Global variables initialized to 0
    static int bjp, cong, ss, mns, aap, nota;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the population: ");
        int pop = sc.nextInt();

        // Loop will iterate population times
        for (int i = 1; i <= pop; i++) {
            System.out.println();
            System.out.println("       WELCOME ");
            System.out.println("1. BJP ");
            System.out.println("2. CONGRESS");
            System.out.println("3. SHIV SENA");
            System.out.println("4. MNS");
            System.out.println("5. AAP");
            System.out.println("6. NOTA");
            System.out.print("Enter your vote: ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1: {
                    System.out.println("JAI SHREE RAM");
                    bjp++;
                    break;
                }
                case 2: {
                    System.out.println("CONGRESS ZINDABAD");
                    cong++;
                    break;
                }
                case 3: {
                    System.out.println("HUM HAI ASLI SENA");
                    ss++;
                    break;
                }
                case 4: {
                    System.out.println("JAI MAHARASHTRA");
                    mns++;
                    break;
                }
                case 5: {
                    System.out.println("APKA EK VOTE MUJHE AZAD KAREGA");
                    aap++;
                    break;
                }
                case 6: {
                    System.out.println("OOHH U R EDUCATED");
                    nota++;
                    break;
                }
                default: {
                    System.out.println("INVALID INPUT");
                    i--; // utilize the waste iteration due to invalid response
                    break;
                }
            }
        }

        // Optional: Displaying final vote counts
        System.out.println("\nVoting Results:");
        System.out.println("BJP Votes: " + bjp);
        System.out.println("CONGRESS Votes: " + cong);
        System.out.println("SHIV SENA Votes: " + ss);
        System.out.println("MNS Votes: " + mns);
        System.out.println("AAP Votes: " + aap);
        System.out.println("NOTA Votes: " + nota);
    }
}
