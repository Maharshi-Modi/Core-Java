import java.util.Scanner;

public class switch_case {
    public static void main(String args[]) {
        System.out.println("adf");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 1;
        while (flag == 1) {
            System.out.println("1: addition");
            System.out.println("2: subraction");
            System.out.println("3: multiplication");
            System.out.println("4: division");
            System.out.println("5: exit");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("sum: " + (a + b));
                    break;
                case 2:
                    System.out.println("sub: " + (a - b));
                    break;
                case 3:
                    System.out.println("mul : " + (a * b));
                    break;
                case 4:
                    System.out.println("div: " + (a / b));
                    break;
                case 5:
                    flag = 0;
                    break;
                default:
                    break;
            }
        }
    }

}
