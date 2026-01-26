class Program87 {

    public static String[] circles(String[] circlePairs) {

        int n = circlePairs.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {

            String[] parts = circlePairs[i].split(" ");

            int x1 = Integer.parseInt(parts[0]);
            int y1 = Integer.parseInt(parts[1]);
            int r1 = Integer.parseInt(parts[2]);
            int x2 = Integer.parseInt(parts[3]);
            int y2 = Integer.parseInt(parts[4]);
            int r2 = Integer.parseInt(parts[5]);

            long dx = x2 - x1;
            long dy = y2 - y1;

            long distSq = dx * dx + dy * dy;
            long rSum = r1 + r2;
            long rDiff = Math.abs(r1 - r2);

            long rSumSq = rSum * rSum;
            long rDiffSq = rDiff * rDiff;

            if (distSq > rSumSq) {
                result[i] = "Disjoint-Outside";
            } else if (distSq < rDiffSq) {
                result[i] = "Disjoint-Inside";
            } else if (distSq == rSumSq || distSq == rDiffSq) {
                result[i] = "Touching";
            } else {
                result[i] = "Intersecting";
            }
        }

        return result;
    }
}
