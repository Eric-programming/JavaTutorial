package StackClass;

public interface IMyStack<T> extends Iterable<T> {

    IMyStack<T> push(T item);

    T pop() throws Exception;

    boolean isEmpty();

    int size();

}