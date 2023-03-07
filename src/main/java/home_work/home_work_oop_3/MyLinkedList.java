package home_work.home_work_oop_3;

import java.util.Iterator;

public class MyLinkedList implements Iterable{
    private Element first;
    private Element last;
    private int counter = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Element zero = new Element("0");
            {
                zero.setNext(first);
            }
            Element current = zero;

            @Override
            public boolean hasNext() {
                return current.getNext() != null;
            }

            @Override
            public Object next() {
                current = current.getNext();
                return current.getData();
            }
        };
    }

    public int size() {
        return counter;
    }

    public void add(Object data) {
        counter++;
        Element newElem = new Element(data);
        if (first == null) {
            first = newElem;
            last = newElem;
            return;
        } else if (last == null) {
            last = newElem;
            return;
        }

        last.setNext(newElem);
        newElem.setPrev(last);
        last = newElem;
    }

    private Element getElement(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException();
        }
        Element result = first;
        for (int i = 1; i <= index ; i++) {
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index) {
        Element newElem = getElement(index);
        return newElem.getData();
    }

    public void addByIndex(int index, Object data) {
        if (counter == index) {
            add(data);
            return;
        }
        counter++;

        Element current = new Element(data);

        if (index == 0) {
            first = current;
        }

        Element next = getElement(index);
        Element prev = next.getPrev();

        current.setNext(next);
        current.setPrev(prev);

        if (prev != null) {
            prev.setNext(current);
        }
    }

    public void removeByIndex(int index){

        Element current = getElement(index);
        Element next = current.getNext();
        Element prev = current.getPrev();

        if (index == 0){
            first = next;
            if (last == current){
                last = null;
            }
        }

        if (index == counter - 1){
            last = prev;
            if (first == current){
                first = null;
            }
        }

        counter--;

        if (next != null){
            next.setPrev(prev);
        }

        if (prev != null){
            prev.setNext(next);
        }
    }
}
