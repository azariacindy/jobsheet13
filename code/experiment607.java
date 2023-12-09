import java.util.Scanner; // import package

public class experiment607 {

    // to calculate the area by multiplying it. The result is then returned.
    static int calculateArea (int l, int w){
        int area = l * w ;
        return area;
    }

    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(l, w) * h ;
        return vol;
    }

    // Initialize p, l, t, L, vol. Then, prompt the user to enter the value earlier
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Input length = ");
        p = input.nextInt();
        System.out.print("Input width = ");
        l = input.nextInt();
        System.out.print("Input height = ");
        t = input.nextInt();

        L = p * l ;
        System.out.println("Area of the rectangle = " + L);
        vol = p * l * t ;
        System.out.println("Volume of the rectangle = " + vol);
    }
}
