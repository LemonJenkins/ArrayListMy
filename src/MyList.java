
public interface MyList {

    void add(Object e);

    void clear();

    int size();

    boolean remove(Object o);

    boolean contains(Object o);

    boolean containsAll(MyList c);

    Object[] toArray();

    Object get(int index) throws IllegalArgumentException;
}
