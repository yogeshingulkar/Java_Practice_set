class Program91 {

    public static void retrievePasscodes(String[] strips) {

        int n = strips.length;
        String[] ordered = new String[n];

        // Step 1: Arrange strips by sequence number
        for (int i = 0; i < n; i++) {
            int seq = strips[i].charAt(0) - '0'; // sequence number
            ordered[seq - 1] = strips[i];
        }

        // Number of passcodes = length of strip - 1
        int rows = ordered[0].length() - 1;

        // Step 2: Reconstruct passcodes row-wise
        for (int r = 1; r <= rows; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < n; c++) {
                sb.append(ordered[c].charAt(r));
            }
            System.out.println(sb.toString());
        }
    }
}
