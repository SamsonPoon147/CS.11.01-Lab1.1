import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
            System.out.println("Please state your age:");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            int dateAge = age/2 + 7;
            System.out.println(age + "-year olds should only date someone who's a minimum of " + dateAge + "-years old");


    }
}

