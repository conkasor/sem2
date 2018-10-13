package decorator;

import factory.TaskContainerFactory;
import containers.Container;
import model.Strategy;
import model.Task;

public class StrategyTaskRunner implements TaskRunner {
    private Container container;

    public StrategyTaskRunner(Strategy strategy) {
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
    }

    @Override
    public void executeOneTask() {
        Task currentTask = container.remove();
        currentTask.execute();
    }

    @Override
    public void executeAll() {
        while(container.isEmpty() == false) {
            executeOneTask();
        }
    }

    @Override
    public void addTask(Task t) {
        this.container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
