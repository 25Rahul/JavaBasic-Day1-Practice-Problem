public class PrimitiveDatatypes {
    public static void main(String[] args) {
        int defaultInt;
        long defaultLong;
        float defaultFloat;
        double defaultDouble;
        char defaultChar;
        boolean defaultBoolean;

        System.out.println("Default values of primitive data types in Java:");

        System.out.println("Default value of int:" +(defaultInt = 0));
        System.out.println("Default value of long:" +(defaultLong = 0L));
        System.out.println("Default value of float:" +(defaultFloat = 0.0f));
        System.out.println("Default value of double:" +(defaultDouble = 0.0));
        System.out.println("Default value of char:" +(defaultChar = '\u0000'));
        System.out.println("Default value of boolean:" +(defaultBoolean = false));
    }
}