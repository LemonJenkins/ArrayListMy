
public class MyListImpl implements MyList {

    private Object[] list;
    private int sizeList;

    public MyListImpl() {
        list = new Object[20];
        sizeList = 0;

    }

    public void add(Object e) {
        list[sizeList] = e;
        this.sizeList++;
    }

    public void clear() {

        for (int i = sizeList; i >= 0; i--) {
            list[i] = null;
        }
    }

    public int size() {
        return sizeList;
    }

    public boolean remove(Object o) {
        if (contains(o)) {
            for (int i = 0; i < sizeList; i--) {
                if (list[i] == o) {
                    list[i] = null;
                    System.arraycopy(list, i + 1, list, i, sizeList - i);
                }
            }
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < sizeList; i++) {
            if (list[i] == o) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(MyList c) {
        for (int i = 0; i < c.size(); i++) {
            if (!this.contains(c.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray() {
        Object[] mass = new Object[this.sizeList];
        System.arraycopy(list, 0, mass, 0, mass.length);
        return mass;
    }

    public Object get(int index){
        if(index < this.sizeList){
        return list[index];
        }
        else {
        throw new IllegalArgumentException();
        }
    }
}
