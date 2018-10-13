package factory;

import containers.Container;
import containers.QueueContainer;
import containers.StackContainer;
import model.Strategy;

public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory instance = null;

    private  TaskContainerFactory(){};
    @Override
    public Container createContainer(Strategy strategy) {
        if (strategy==Strategy.LIFO){
            return new StackContainer();
        }
        else {
            return new QueueContainer();
        }
    }
    public static TaskContainerFactory getInstance(){
        if (instance == null)
            instance = new TaskContainerFactory();

        return instance;
    }
}
