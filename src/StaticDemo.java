public class StaticDemo {
    static int count = 0;

    static {
        System.out.println("Inside static block");
        count = 1;
    }
    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count value: " + count);

        incrementCount();
        System.out.println("Count after increment: " + count);

        System.out.println("Accessing count directly: " + count);

        StaticDemo obj = new StaticDemo();
        System.out.println("Accessing count through object: " + obj.count);
    }
}

