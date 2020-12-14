package QueueClass;

public interface IMyQueue<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    IMyQueue<T> add(T item);

    T remove() throws Exception;
}
