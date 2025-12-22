
import java.util.List;
import java.util.Iterator;

public class MyMilk implements IMilk {

    @Override
    public int f1(List<Milk> t) {
        int count = 0;
        for (Milk milk : t) {
            String name = milk.getName();
            String[] words = name.split("\\s+");
            for (String word : words) {
                if (!containsDigit(word)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void f2(List<Milk> t) {
        int minLoad = Integer.MAX_VALUE;
        for (Milk milk : t) {
            String name = milk.getName().toLowerCase();
            if (name.contains("d")) {
                if (milk.getLoad() < minLoad) {
                    minLoad = milk.getLoad();
                }
            }
        }

        if (minLoad != Integer.MAX_VALUE) {
            for (Milk milk : t) {
                milk.setLoad(minLoad);
            }
        }
    }

    @Override
    public void f3(List<Milk> t) {
        Iterator<Milk> iterator = t.iterator();
        while (iterator.hasNext()) {
            Milk milk = iterator.next();
            int digitCount = countDigits(milk.getLoad());
            if (digitCount % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
