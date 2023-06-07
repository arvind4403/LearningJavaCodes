import java.util.Scanner;

public class Console {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter Your age:");
        int age = sc.nextInt();
        System.out.println("Entered name is :" + name + "and the age is: " + age );
        sc.close();

    }
}
