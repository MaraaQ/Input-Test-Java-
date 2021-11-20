import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input test: Input your name.");
        String name = scanner.nextLine();
        System.out.println("Input test: How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input test: What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You enjoy eating "+food);       
    }
}
