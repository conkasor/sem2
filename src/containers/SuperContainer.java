package containers;

import model.Task;

import java.util.List;

public abstract class SuperContainer implements Container {
    protected List<Task> list;
    SuperContainer(List<Task> l){list=l;};
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public abstract Task remove();

    @Override
    public abstract void add(Task task);

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
