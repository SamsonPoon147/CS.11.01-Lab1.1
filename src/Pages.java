import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        System.out.println("Please state your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int readAge = 100 - age;
        System.out.println("" + age + "-year olds should read at least " + readAge + " pages before giving up on a book.");
    }
}
