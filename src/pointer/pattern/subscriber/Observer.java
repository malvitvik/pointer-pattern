package pointer.pattern.subscriber;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}