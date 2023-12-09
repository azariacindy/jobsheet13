import java.util.Scanner;

public class expressingGratitude07 {
    public static String getGreetingRecipient07() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou07() {
        String name = getGreetingRecipient07();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");

        String additionalGreetings = "Wishing you a great day!";
        sayAddtionalGreetings07(additionalGreetings);
    }

    public static void sayAddtionalGreetings07(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        sayThankyou07();
    }
}
