public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int[] banana = new int[3];
        banana[0] = 1;
        banana[1] = 2;
        banana[2] = 3;
        double[] banana1 = {1.57, 7.654, 9.986};
        long[] banana2 = {5, 10};
        // task2

        for (int i = 0; i < banana.length; i++) {
            System.out.print(banana[i]);
            if (i != banana.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < banana1.length; i++) {
            System.out.print(banana1[i]);
            if (i != banana1.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < banana2.length; i++) {
            System.out.print(banana2[i]);
            if (i != banana2.length - 1) {
                System.out.print(" , ");
            }
        }

        //задача 3
        System.out.println();
        System.out.println();
        for (int i = banana.length - 1; i >= 0; i--) {
            System.out.print(banana[i]);
            if (i != 0) {
                System.out.print(" , ");

            }
        }System.out.println();
        for (int i = banana1.length - 1; i >= 0; i--) {
            System.out.print(banana1[i]);
            if (i != 0) {
                System.out.print(" , ");

            }
        }System.out.println();
        for (int i = banana2.length - 1; i >= 0; i--) {
            System.out.print(banana2[i]);
            if (i != 0) {
                System.out.print(" , ");
            }

            // задача 4

        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < banana.length; i++) {
            if (banana[i] % 2 == 1) {
                banana[i]++;
                System.out.print(banana[i]);
                if (i != banana2.length - 1) {
                    System.out.print(" , ");{
                    }
                }
            }
        }
    }
}