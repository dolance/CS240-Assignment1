// Build a number-base converter supporting binary, decimal, octal, and hexadecimal.
import java.util.Scanner;

public class NumberBaseConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String numberToConvert = input.nextLine();

        System.out.print("Enter original base (2, 8, 10, or 16): ");
        int originalBase = input.nextInt();

        System.out.print("Enter base to convert to (2, 8, 10, or 16): ");
        int baseToConvert = input.nextInt();

        /*
        Integer.parseInt(a,b) converts the string "a" into an int by interpreting it using base b
        numberValue holds an integer value after the string is interpreted using the given base
         */
        int numberValue = Integer.parseInt(numberToConvert, originalBase);

        /*
        Integer.toString(a,b) converts an integer to a string using base "b"
        convertedValue needs to be a string to hold hexadecimal values A-F
        Used ChatGPT 5.6 to understand and implement 8-bit two's-complement conversion logic
         */
        String convertedValue = "";
        if (numberValue < 0 && baseToConvert == 2) {

            if (numberValue < -128) {
                convertedValue = "Value is outside the 8-bit signed range.";
            }
            else {
                int eightBitValue = 256 + numberValue;
                convertedValue = Integer.toString(eightBitValue, 2);
            }

        }
        else {
            convertedValue = Integer.toString(numberValue, baseToConvert).toUpperCase();
        }

        System.out.println("Converted Number: " + convertedValue);
    }
}

