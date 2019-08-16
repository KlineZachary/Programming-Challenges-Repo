import java.util.*;
public class WordsForNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean lineDidBreak = false;
        while (keyboard.hasNextLine()) {
            String line = keyboard.nextLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.matches("\\d+")) {
                    int num = Integer.parseInt(word);
                    String wordNum = convertLessThanOneThousand(num);
                    if (num == 0) wordNum = "zero";
                    if (wordNum.contains("-"))
                        wordNum = format(wordNum);
                    if (lineDidBreak)
                        System.out.print(wordNum.substring(0, 1).toUpperCase() + wordNum.substring(1) + " ");
                    else
                        System.out.print(wordNum + " ");
                } else {
                    if (lineDidBreak)
                        System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
                    else
                        System.out.print(word + " ");
                }
                lineDidBreak = false;
            }
            lineDidBreak = true;
            System.out.println();
        }
    }

    // Get rid of '-'' if not needed
    private static String format(String word) {
        int indexMark = word.indexOf("-");
        String afterMark = word.substring(indexMark + 1);
        if (afterMark.isEmpty())
            return word.substring(0, indexMark);
        return word;
    }

    private static final String[] tensNames = { "", "ten-", "twenty-", "thirty-", "forty-", "fifty-", "sixty-",
            "seventy-", "eighty-", "ninety-" };

    private static final String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };

    private static String convertLessThanOneThousand(int number) {
        String current;
        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + "hundred" + current;
    }
}