
import java.util.*;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String[] words = str.split("\\s+");

        for (String word : words) {
            int oddDigitCount = 0;

            for (char c : word.toCharArray()) {

                if (Character.isDigit(c)) {

                    if ((c - '0') % 2 != 0) {
                        oddDigitCount++;
                    }
                }
            }

            if (oddDigitCount >= 2) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+");

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for (String w : words) {
            if (w.length() > maxLength) {
                maxLength = w.length();
            }
            if (w.length() < minLength) {
                minLength = w.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean replaced = false;

        for (int i = 0; i < words.length; i++) {

            if (!replaced && words[i].length() == minLength) {
                sb.append(maxLength);
                replaced = true;
            } else {
                sb.append(words[i]);
            }   

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
