package factory;
import containers.Container;
import model.Strategy;

public interface Factory {
    Container createContainer(Strategy strategy);
}

