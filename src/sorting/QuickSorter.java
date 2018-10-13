package sorting;

import java.util.List;

public class QuickSorter extends Sorter {
    @Override
    public void sort(List<Integer> l) {
        doSort(l,0,l.size()-1);
    }
    private void doSort(List<Integer>l , int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(l, low, high);

            // Recursively sort elements before
            // partition and after partition
            doSort(l, low, pi-1);
            doSort(l, pi+1, high);
        }
    }
    private int partition(List<Integer> l, int low, int high)
    {
        int pivot = l.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (l.get(j) <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = l.get(i);
                l.set(i,l.get(j));
                l.set(j,temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp =l.get(i+1);
        l.set(i+1,l.get(high));
        l.set(high,temp);

        return i+1;
    }
}
