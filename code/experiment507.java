public class experiment507 {
    static void show (String str, int... a){
        System.out.println("String: "+ str);
        System.out.println("Number of arguments/parameters: " + a.length);

        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // print method, to print an arbitrary number of values without specifying the size of the array explicitly
    public static void printValues(String... values) {
        for (String value : values) {
            System.out.println(value);
        }
    }

    // sum method, this function can sum up any number of integers provided as arguments
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
    
    // Logger method, for allows logging messages with optional parameters
    public static void logInfo(String message, Object... params) {
        System.out.println("INFO: " + String.format(message, params));
    }    

    public static void main(String[] args){
        show("Programming Fundamentals 2023", 100, 200);
        show("Information Technology", 1, 2, 3, 4, 5);
        show("Informatics");
    }
}
