package Symbol_Table;

import java.util.List;

//Symbol Table
public interface OrderedST<Key extends Comparable<Key>, Value> {

    int size();

    void put(Key key, Value value);

    Value get(Key key);

    Key min();

    Key max();

    List<Key> keys(Key l, Key h);
}