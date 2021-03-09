package shipp;

public class MyBox<T> {

    private T contents;

    public MyBox(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}
