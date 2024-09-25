package exercicesED.util;

public class NoDuplo<T> {

    private T begin;
    private NoDuplo<T> next;
    private NoDuplo<T> before;

    public NoDuplo(T begin) {
        this.begin = begin;
        this.next = null;
        this.before = null;
    }

    public NoDuplo(T begin, NoDuplo<T> next, NoDuplo<T> before) {
        this.begin = begin;
        this.next = next;
        this.before = before;
    }

    public T getBegin() {
        return begin;
    }

    public void setBegin(T begin) {
        this.begin = begin;
    }

    public NoDuplo<T> getNext() {
        return next;
    }

    public void setNext(NoDuplo<T> next) {
        this.next = next;
    }

    public NoDuplo<T> getBefore() {
        return before;
    }

    public void setBefore(NoDuplo<T> before) {
        this.before = before;
    }
}