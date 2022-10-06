import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        String[] ar1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ar2 = {"", "", "", "third", "four", "fif", "six", "seven", "eigh", "nine"};
        String dvi;
        String chuc;
        String tram;
        int numDvi;
        int numChuc;
        int numTram;
        String result = "";
        switch (number) {
            case 0:
                result = "zero";
                break;
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 14:
                result = "fourteen";
                break;
        }
        if (result.equals("") && number >= 0) {
            if (number < 10) {
                result = ar1[number];
            } else if (number < 100) {
                numChuc = number / 10;
                numDvi = number - numChuc * 10;
                if (numChuc == 1) {
                    result = ar2[numDvi] + "teen";
                } else if (numChuc == 2) {
                    chuc = "twenty";
                    result = chuc + " " + ar1[numDvi];
                } else if (numChuc >= 3) {
                    chuc = ar2[numChuc];
                    result = chuc + "ty " + ar1[numDvi];
                }
            }
            System.out.printf("%d convert to text is: %s", number, result);
        }
    }
}