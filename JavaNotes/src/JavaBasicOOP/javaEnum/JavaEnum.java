package JavaBasicOOP.javaEnum;

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {

    Macbook(2000), XPS(2200), Surface, Thinkpad;

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop() {
        price = 1600;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class JavaEnum {

    public static void main(String[] args) {
        //runStatusEnumExample();
        runLaptopEnumExample();

    }

    private static void runLaptopEnumExample() {
        Laptop laptop = Laptop.Macbook;
        Laptop[] laptops = Laptop.values();

        System.out.println(laptop);
        System.out.println(laptop.getPrice());

        for (Laptop l : laptops) {
            System.out.println(l +" : "+ l.getPrice());
        }
    }

    private static void runStatusEnumExample() {
        Status status = Status.Success;
        Status[] statusArray = Status.values();

        System.out.println(Status.values());

        System.out.println(status);
        System.out.println(status.ordinal());

        for (Status s : statusArray) {
            System.out.println(s + " : " + s.ordinal());
        }

        switch (status) {
            case Running:
                System.out.println("In progress");
                break;
            case Pending:
                System.out.println("In Wait");
                break;
            case Failed:
                System.out.println("Try Again!");
                break;

            default:
                System.out.println("Done");
                ;
        }
    }
}
