import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1.1, 2, 3, 4
        System.out.println("Задание 1.1, 2, 3, 4");
        int [] example1 = new int[3];
        example1 [0] = 1;
        example1 [1] = 2;
        example1 [2] = 3;
        for (int i = 0; i < example1.length; i++) {
            System.out.print(example1[i]);
            if (i != example1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = example1.length - 1; i >= 0; i--) {
            System.out.print(example1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < example1.length; i++) {
            if (example1[i] % 2 != 0) {
                example1[i] += 1;
            }
            System.out.println(example1[i]);
        }

        //Task 1.2, 2, 3
        System.out.println("Задание 1.2, 2, 3");
        double [] example2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < example2.length; i++) {
            System.out.print(example2[i]);
            if (i != example2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = example2.length - 1; i >= 0; i--) {
            System.out.print(example2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Task 1.3, 2, 3
        System.out.println("Задание 1.3, 2, 3");
        char [] example3 = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < example3.length; i++) {
            System.out.print(example3[i]);
            if (i != example3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = example3.length - 1; i >= 0; i--) {
            System.out.print(example3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();



    }
}