import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the letter grade you got (A, B, C, D, E, F): ");
        String grade = input.next().toUpperCase(); // making the user input their grade and the upper case is there so its not case sensitive 

        if (grade.equals("A")) {
            System.out.println("You have achieved first class"); // these are grade classifications
        } else if (grade.equals("B")) {
            System.out.println("You have achieved 2:1");
        } else if (grade.equals("C")) {
            System.out.println("You have achieved 2:2");
        } else if (grade.equals("D")) {
            System.out.println("You have acheived 3rd");
        } else if (grade.equals("E")) {
            System.out.println(" You have achieved ordinary");
        } else if (grade.equals("F")) {
            System.out.println(" You have failed ");
        }

        input.close();
    }
}
