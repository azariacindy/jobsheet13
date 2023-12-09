import java.util.Scanner;

public class Gratitude07 {

        public static void sayThankyou07(){
                System.out.println("Thank you for being the best teacher in the world. \n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
        }

        public static void sayAdditionalGreetings07(String greeting) {
                System.out.println(greeting);
        }

        public static void main(String[] args) {
            sayThankyou07();
            String expression = "Thank you ... wish you all the best!!";
            sayAdditionalGreetings07(expression);
        }
}
