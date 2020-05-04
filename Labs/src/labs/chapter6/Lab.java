package labs.chapter6;

public class Lab {

    public static void main (String[] args) {
//        int i = 0;
//        while (i < 10)
//        {
//            System.out.println("Number is " + i);
//            System.out.println("Square is " + (i * i));
//            if (i % 2 != 0)
//            {
//                System.out.println("Cube is " + (i * i * i));
//            }
//            i++;
//        }

        // own solution
//        int[] numbers = new int[20];
//        for (int j = 0; j < 20; j++)
//        {
//            for (int i = 2; i < 20; i++)
//            {
//                numbers[0] = 0;
//                numbers[1] = 1;
//                numbers[i] = numbers[i-2] + numbers[i-1];
//            }
//            System.out.println(j + ": " + numbers[j]);
//        }

        // course solution
        int f0 = 0;
        int f1 = 1;

        System.out.println("0: " + f0);
        System.out.println("1: " + f1);

        for (int i = 2; i < 20; i++)
        {
            int sum = f0 + f1;
            System.out.println(i + ": " + sum);
            f0 = f1;
            f1 = sum;
        }
    }
}
