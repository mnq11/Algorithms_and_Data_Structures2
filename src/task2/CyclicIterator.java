package task2;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class CyclicIterator implements Iterator {

    private final List list;
    private Iterator iterator;

    public CyclicIterator(List list) {
        this.list = list;
        initIterator(list);
    }

    private void initIterator(List list) {
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }

    @Override
    public Object next() {
        if (!this.iterator.hasNext())
            initIterator(list);
        return this.iterator.next();
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException("This method has no meaning in CyclicIterator class!");
    }
}