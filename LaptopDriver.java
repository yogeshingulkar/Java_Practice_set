class Laptop {
    // data members
    String brand;
    String model;
    double price;
    int storage;       // in GB
    String processor;
    int ram;           // in GB
    double screenSize; // in inches
    double weight;     // in kg
    String color;

    // method to display laptop info
    public void displayLaptopInfo() {
        System.out.println("\nLaptop Info:");
        System.out.printf("Brand : %s\n", brand);
        System.out.printf("Model : %s\n", model);
        System.out.printf("Price : ₹%.2f\n", price);
        System.out.printf("Storage : %dGB\n", storage);
        System.out.printf("Processor : %s\nRAM : %dGB\n", processor, ram);
        System.out.printf("Screen Size : %.1f inch\nWeight : %.1f Kg\n", screenSize, weight);
        System.out.printf("Color : %s\n", color);
    }
}

class LaptopDriver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "DELL";
        l1.model = "XPS 15";
        l1.price = 185000;
        l1.storage = 1000;
        l1.processor = "Intel i9 13th Gen";
        l1.ram = 32;
        l1.screenSize = 15.6;
        l1.weight = 1.8;
        l1.color = "Silver";

        l1.displayLaptopInfo();
    }
}
