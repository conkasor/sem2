package containers;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class QueueContainer extends SuperContainer {
    public QueueContainer() {
        super(new ArrayList<>());
    }
    @Override
    public Task remove() {
        if(super.list.isEmpty())
            return null;
        Task r = super.list.remove(0);
        return r;
    }

    @Override
    public void add(Task task) {
        super.list.add(task);
    }
}
