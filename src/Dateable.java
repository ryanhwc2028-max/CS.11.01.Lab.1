import java.util.Scanner; //i just learnt how to use scanner online (for prompts)
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, minimum;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        minimum = 7+(age/2);
        System.out.println(age + "-year olds should date somebody who is at least " + minimum + " years old");
    }   
}

