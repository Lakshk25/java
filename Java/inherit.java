class subtract{
    int sub(int a , int b){
        return a - b;
    }
}

public class inherit {
    
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        subtract s = new subtract();
        System.out.println(add(5, 3));
        
        System.out.println(s.sub(5, 3));

        inherit program = new inherit();
        program.start();

    }

    public void start() {

        circle c = new circle(5);
        System.out.println(c.area());
    }

    class circleData {
        final double PI = 3.14;
    }

    class circle extends circleData {
        int radius;

        public circle() {
            radius = 0;
        }

        public circle(int radius) {
            this.radius = radius;
        }

        void setR(int radius) {
            this.radius = radius;
        }

        double area() {
            return PI * radius * radius;
        }
    }
}
