package edu.ti.collections.list.queue;

import edu.ti.collections.list.linked.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void enqueue(T obj) {
        //TODO: Implement
        list.append(obj);
        //list.insert(obj);
    }

    public T dequeue() {
        //TODO: Implement
        return list.remove(0);
        //return list.remove(list.size() - 1);
    }
}
