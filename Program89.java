class Program89 {

    public static int[] getMinTime(
            int cache_size,
            int cache_time,
            int server_time,
            String[] urls) {

        int n = urls.length;
        int[] result = new int[n];

        // Cache implemented using array
        String[] cache = new String[cache_size];
        int cacheCount = 0;

        for (int i = 0; i < n; i++) {
            String currentUrl = urls[i];
            int foundIndex = -1;

            // Search in cache
            for (int j = 0; j < cacheCount; j++) {
                if (cache[j].equals(currentUrl)) {
                    foundIndex = j;
                    break;
                }
            }

            if (foundIndex != -1) {
                // Cache HIT
                result[i] = cache_time;

                // Move accessed URL to most recent position
                String temp = cache[foundIndex];
                for (int j = foundIndex; j < cacheCount - 1; j++) {
                    cache[j] = cache[j + 1];
                }
                cache[cacheCount - 1] = temp;

            } else {
                // Cache MISS
                result[i] = server_time;

                if (cache_size == 0) continue;

                if (cacheCount < cache_size) {
                    // Space available
                    cache[cacheCount++] = currentUrl;
                } else {
                    // Cache full → remove oldest (index 0)
                    for (int j = 0; j < cache_size - 1; j++) {
                        cache[j] = cache[j + 1];
                    }
                    cache[cache_size - 1] = currentUrl;
                }
            }
        }

        return result;
    }
}
