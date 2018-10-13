package containers;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends SuperContainer {
    public StackContainer() {
        super(new ArrayList<>());
    }

    @Override
    public Task remove() {
        if(isEmpty())
            return null;
        Task r = list.remove(size()-1);
        return r;
    }

    @Override
    public void add(Task task) {
        list.add(task);
    }



}
