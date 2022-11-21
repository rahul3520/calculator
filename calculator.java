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

        System.out.println("1:Addition \n 2:Subtraction \n 3:Multiplication \n 4:Division\n");

        int choice=0;

        System.out.println("Enter a choice:");

        Scanner sc=new Scanner(System.in);

        choice=sc.nextInt();

        System.out.println("Enter 2 numbers:");

        int a=sc.nextInt();
        int b=sc.nextInt();


        switch(choice)
        {
            case 1: System.out.println(add(a,b));

            case 2: System.out.println(sub(a,b));

            case 3: System.out.println(mul(a,b));

            case 4: System.out.println(div(a,b));

            default: System.out.println("Wrong choice");
        }

    }
}
