//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int age;

        System.out.println("Welcome to the theater!");

        System.out.println("Please enter your age: ");

        if (in.hasNextInt()) {

            age = in.nextInt();

            in.nextLine();

            if (age >= 21) {

                System.out.println("You get a wrist band!");

            }
        }
    }
}