import java.util.Scanner;

public class Greetings07 {
    public static String greetingRecipient07() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void main(String[] args) {
        String name = greetingRecipient07();
        System.out.println("Thank you " + name + " may the force be with you!");
    }
}
