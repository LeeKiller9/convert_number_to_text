import java.util.Scanner;
public class ConvertNumberToText {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        String[] ar1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ar2 = {"", "", "", "thir", "four", "fif", "six", "seven", "eigh", "nine"};
        int numDvi;
        int numChuc;
        int numTram;
        String result = "";
        numTram = number / 100;
        numChuc = (number - numTram * 100) / 10;
        numDvi = number - numTram * 100 - numChuc * 10;
        if (number == 0) {
            result += "zero";
        } else {
            if (numTram > 0) {
                result += ar1[numTram] + " hundred ";
            }
            if (numChuc == 0) {
                result += ar1[numDvi];
            } else {
                switch (numChuc * 10 + numDvi) {
                    case 10:
                        result += "ten";
                        break;
                    case 11:
                        result += "eleven";
                        break;
                    case 12:
                        result += "twelve";
                        break;
                    case 14:
                        result += "fourteen";
                        break;
                    default:
                        if (numChuc == 1) {
                            result += ar2[numDvi] + "teen";
                        } else if (numChuc == 2) {
                            result += "twenty " + ar1[numDvi];
                        } else {
                            result += ar2[numChuc] + "ty " + ar1[numDvi];
                        }
                }
            }
        }
        System.out.printf("%d convert to text is: %s", number, result);
    }
}
