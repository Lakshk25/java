
public class oop {
    public static void main(String[] args) {

        oop program = new oop();
        program.start();

    }

    public void start() {
        car c = new car(50, "java");
        // System.out.println(c.price);
        // System.out.println(c.model);

        c.setM("audi");
        System.out.println(c.getModel());

        person p = new person(15, "what");
        person d = new person(15, "how");
        System.out.println(person.count);

        Developer dv = new Developer(10, "newd");
        dv.walk(5);

    }

    class car {
        private int price;
        private String model;

        // car
        car(int price, String model) {
            this.price = price;
            this.model = model;
        }

        int getPrice() {
            return price;
        }

        String getModel() {
            return model;
        }

        void setP(int price) {
            this.price = price;
        }

        void setM(String model) {
            this.model = model;
        }
    }
}

class Developer extends person{
    public Developer(int age , String name){
        super(age , name);
    }
}
class person {
    String name;
    int age;

    static int count;

    public person(int age, String name) {
        this.name = name;
        this.age = age;
        count++;
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
}
