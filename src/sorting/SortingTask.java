package sorting;

import model.Task;

import java.util.List;

public class SortingTask extends Task {
    private List<Integer>l;
    public SortingTask(String taskId, String descriere, Sorter sorter, List<Integer> l) {
        super(taskId, descriere);
        this.sorter = sorter;
        this.l=l;
    }

    private Sorter sorter;
    @Override
    public void execute() {
        sorter.sort(l);
        System.out.println(l);
    }
}
