package Symbol_Table;

public interface UnorderedST<Key, Value> {

    Value get(Key key);

    void put(Key key, Value value);

    void delete(Key key);
}