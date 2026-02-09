import java.util.Scanner;

public class Main10 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age= input.nextInt(); // entering the age from user

        if (age >=18) {  // checking condition if age is 18 +
            System.out.println("you are above 18 years old");
        }

            else {
                System.out.println("you are below 18 years old");
            }
        }
    }

