class Spacecraft {
    // data members
    String name;
    String missionType;   // Orbiter, Lander, Rover, Probe
    String launchDate;
    double weight;        // in kg
    double speed;         // in km/s
    String fuelType;
    int crewCapacity;
    double missionDuration; // in years
    String agency;        // e.g. NASA, ISRO, ESA

    // method to display spacecraft info
    public void displaySpacecraftInfo() {
        System.out.printf("Name : %s\n", name);
        System.out.printf("Mission Type : %s\n", missionType);
        System.out.printf("Launch Date : %s\n", launchDate);
        System.out.printf("Weight : %.1f Kg\n", weight);
        System.out.printf("Speed : %.2f Km/s\n", speed);
        System.out.printf("Fuel Type : %s\n", fuelType);
        System.out.printf("Crew Capacity : %d\n", crewCapacity);
        System.out.printf("Mission Duration : %.1f Years\n", missionDuration);
        System.out.printf("Space Agency : %s\n", agency);
    }
}

class SpacecraftDriver {
    public static void main(String[] args) {
        Spacecraft sc1 = new Spacecraft();
        sc1.name = "Chandrayaan-3";
        sc1.missionType = "Lander + Rover";
        sc1.launchDate = "14 July 2023";
        sc1.weight = 3900;
        sc1.speed = 10.5;
        sc1.fuelType = "Liquid Fuel + Solid Boosters";
        sc1.crewCapacity = 0; // unmanned
        sc1.missionDuration = 1.0;
        sc1.agency = "ISRO";

        sc1.displaySpacecraftInfo();


        Spacecraft obj1 = new Spacecraft();
        obj1.name = "Chandrayaan-4";
        obj1.missionType = "Lander + Rover";
        obj1.launchDate = "14 July 2023";
        obj1.weight = 3900;
        obj1.speed = 10.5;
        obj1.fuelType = "Liquid Fuel + Solid Boosters";
        obj1.crewCapacity = 0; // unmanned
        obj1.missionDuration = 1.0;
        obj1.agency = "ISRO";

        obj1.displaySpacecraftInfo();
    }
}
