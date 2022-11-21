import java.util.Scanner;

public class calculator {

    public static int add(int a,int b)
    {
        return a+b;
    }

    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static int mul(int a,int b)
    {
        return a*b;
    }

    public static int div(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args) {

        System.out.println("Select an operation:");

        System.out.println("1:Addition \n 2:Subtraction \n 3:Multiplication \n 4:Division\n 5:Exit");

        int choice=0;

        System.out.println("Enter a choice:");

        Scanner sc=new Scanner(System.in);

        choice=sc.nextInt();

        System.out.println("Enter 2 numbers:");

        int a=sc.nextInt();
        int b=sc.nextInt();

        int exit=0;

        while (exit!=1)
        {
            switch (choice) {
                case 1:
                    System.out.println(add(a, b));
                    break;

                case 2:
                    System.out.println(sub(a, b));
                    break;

                case 3:
                    System.out.println(mul(a, b));
                    break;

                case 4:
                    System.out.println(div(a, b));
                    break;

                case 5:
                    exit = 1;
                    break;

                default: System.out.println("Wrong choice");
            }

            System.out.println("Enter a value for choice:");
            choice=sc.nextInt();

            System.out.println("Enter 2 numbers:");

            a=sc.nextInt();
            b=sc.nextInt();


        }

    }
}
