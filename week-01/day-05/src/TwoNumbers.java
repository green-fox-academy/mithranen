public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22
        System.out.println(13 + 22);

        // Print the result of 13 substracted from 22
        System.out.println(22 - 13);

        // Print the result of 22 multiplied by 13
        System.out.println(22 * 13);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        float a = 22f;
        float b = 13f;
        System.out.println(a / b);

        // Print the integer part of 22 divided by 13
        System.out.println(Math.round(a) / Math.round(b));

        // Print the remainder of 22 divided by 13
        System.out.println(a % b);
    }
}
