
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (Coffee c : t) {
            String name = c.getName();
            boolean hasA = name.contains("A");
            boolean hasB = name.contains("B");

            if (!(hasA && hasB)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        if (t.isEmpty()) {
            return;
        }
        // find the maxsize
        int maxSize = t.get(0).getSize();
        for (Coffee c : t) {
            if (c.getSize() > maxSize) {
                maxSize = c.getSize();
            }
        }

        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSize() == maxSize) {
                t.remove(i);
                break;
            }
        }
    }

    @Override
    public void f3(List<Coffee> t) {
        List<Coffee> subList;
        if (t.size() >= 3) {
            subList = t.subList(0, 3);
        } else {
            subList = t;
        }

        Collections.sort(subList, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {

                int unit1 = o1.getSize() % 10;
                int unit2 = o2.getSize() % 10;

                // (Descending): o2 - o1
                return unit2 - unit1;
            }
        }
        );
    }

}
