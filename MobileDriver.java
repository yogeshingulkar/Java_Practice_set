class Mobile {
    // data members (non-static variables)
    String brand;
    String model;
    double price;
    int storage;
    String color;
    String processor;
    int ram;
    double screenSize;
    double weight;

    // method to display mobile info
    public void displayMobileInfo() {
        System.out.println("\nMobile Info:");
        System.out.printf("Brand : %s\n", brand);
        System.out.printf("Model : %s\n", model);
        System.out.printf("Price : ₹%.2f\n", price);
        System.out.printf("Storage : %dGB\nColor : %s\n", storage, color);
        System.out.printf("Processor : %s\nRAM : %dGB\n", processor, ram);
        System.out.printf("ScreenSize : %.1f inch\nWeight : %.1f gms\n", screenSize, weight);
    }
}

class MobileDriver {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "SAMSUNG";
        obj.model = "S25 Ultra";
        obj.price = 130000;
        obj.storage = 1024;
        obj.color = "BLACK";
        obj.processor = "SNAPDRAGON";
        obj.ram = 12;
        obj.screenSize = 7.8;
        obj.weight = 210;

        obj.displayMobileInfo();
    }
}
