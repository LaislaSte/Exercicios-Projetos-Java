package exercicesED.util;

public class No<T> {
    private T begin;
    private No<T> next;

    public No(T begin) {
        this.begin = begin;
        this.next = null;
    }

    public No(T begin, No<T> next) {
        this.begin = begin;
        this.next = next;
    }

    public T getBegin() {
        return begin;
    }

    public void setBegin(T begin) {
        this.begin = begin;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No [begin=" + begin + ", next=" + next + "]";
    }
}
