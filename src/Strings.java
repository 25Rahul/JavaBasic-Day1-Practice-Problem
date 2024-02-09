public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal (case-sensitive).");
        } else {
            System.out.println("Strings are not equal (case-sensitive).");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case-insensitive).");
        } else {
            System.out.println("Strings are not equal (case-insensitive).");
        }

    }
}
