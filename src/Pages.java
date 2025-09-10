import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, minimum;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        minimum = 100-age;
        System.out.print("You should read " + minimum + " before giving up on a book");
    }
}
