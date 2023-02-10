

import java.util.Arrays;

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        int[] marks = new int[3];

        marks[0] = 123;
        marks[1] = 323;
        marks[2] = 23;
        Arrays.sort(marks);
        System.out.println(marks[2]);
        System.out.println(marks[0]);

        byte abc = 31;
        System.out.println(abc);

        String name = new String("abcd");
        String fname = new String("xyz");
        String ename = name + " not your " + fname;
        String rname = name.replace('a', 'y');
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(fname);
        System.out.println(ename);
        System.out.println(rname);
        System.out.println(name.substring(0 , 3));

        // casting

        int p = 100;
        double f = p + 123.2;
        System.out.println(f);


        int q = 100;
        int r = p + (int)123.2;
        System.out.println(r);

        final double PI = 3.14;


        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println("sum of a + b is " + c);
        System.out.println("sum of a + b is " + (a+b));
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num");
        
        int num = sc.nextInt();
        
        System.out.println(num);
        
        System.out.println("Enter name");
        String nam = sc.nextLine();
        System.out.println(nam);

        boolean check = true;

    }
}
