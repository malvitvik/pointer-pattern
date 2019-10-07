package pointer.pattern.subscriber;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print("Bin value: " + Integer.toBinaryString(subject.getState()));
    }
}