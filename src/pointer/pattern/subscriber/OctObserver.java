package pointer.pattern.subscriber;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print("Oct value: " + Integer.toOctalString(subject.getState()));
    }
}