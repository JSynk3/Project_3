package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Bag<T> implements Container<T>{

    private List<T> container;

    public Bag(){
        this.container = new ArrayList<T>();
    }
    @Override
    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override
    public int size() {
        return this.container.size();
    }

    @Override
    public void add(T item) {
        this.container.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.container.iterator();
    }
}