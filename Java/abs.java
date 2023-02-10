public class abs {

    public static void main(String[] args) {

        abs program = new abs();
        program.start();
    }

    public void start() {
        audi a = new audi();
        a.start();
    }

    class audi extends Car {

        void start() {
            System.out.println("audi start");
        }
    }

    abstract class Car {        // or
        int price;

        abstract void start();
    }

}