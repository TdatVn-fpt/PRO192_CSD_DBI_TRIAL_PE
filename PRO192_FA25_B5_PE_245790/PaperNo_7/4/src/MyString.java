public class MyString implements IString {

    @Override
    public int f1(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {

                if (i > 0 && Character.isUpperCase(str.charAt(i - 1))) {

                    boolean isLastDigit = true;
                    for (int j = i + 1; j < str.length(); j++) {
                        if (Character.isDigit(str.charAt(j))) {
                            isLastDigit = false;
                            break;
                        }
                    }

                    if (!isLastDigit) {
                        sum += Character.getNumericValue(c);
                    }
                }
            }
        }

        return sum;
    }

    @Override
    public String f2(String str) {

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int uppercaseCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    uppercaseCount++;
                }
            }

            if (uppercaseCount == 1) {
                result.append(word);
            }
        }

        return result.toString();
    }
}

