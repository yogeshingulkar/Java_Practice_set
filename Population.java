public class Population {

    public static void main(String[] args) {

        long currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60;
        System.out.println(secondsInYear);

        int birthsPerYear = secondsInYear / 7;
        int deathsPerYear = secondsInYear / 13;
        int immigrantsPerYear = secondsInYear / 45;

        int populationChangePerYear = birthsPerYear + immigrantsPerYear - deathsPerYear;

        System.out.println("Current Population: " + population);
        System.out.println("Projected Population for the next 5 years:");

        for (int year = 1; year <= 5; year++) {
            population = currentPopulation + populationChangePerYear;
            System.out.println("Year " + year + ": " + population);
        }

    }
}
