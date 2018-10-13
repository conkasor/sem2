package sorting;

import java.util.List;

public class BubbleSorter extends Sorter {
    @Override
    public void sort(List<Integer> l) {
        int n = l.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (l.get(j) > l.get(j + 1))
                {
                    int temp = l.get(j);
                    l.set(j,l.get(j+1));
                    l.set((j+1),temp);
                }
    }
}
