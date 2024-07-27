import java.util.Scanner;

public class input_user {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n1, n2;
        // System.out.println("enter 2 nums");
        // n1 = sc.nextInt();
        // n2 = sc.nextInt();
        // int sum = n1 + n2;
        // System.out.println("sum : " + sum);

        // float a, b;
        // System.out.println("enter two floats");
        // a = sc.nextFloat();
        // b = sc.nextFloat();
        // float sum_f = a + b;
        // System.out.println("float sum: " + sum_f);

        System.out.println("enter the string");
        String str;
        str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}