package com.bl.linked_list;

public class MyNode<K> implements INode<K> {

    private INode next;
    private K key;

    MyNode(int key) {

        this.key = null;
        this.next = null;
    }

    @Override
    public K getKey() {

        return key;
    }

    @Override
    public void setKey(K key) {

        this.key = key;
    }

    public INode getNext() {

        return next;
    }

    public void setNext(INode next) {

        this.next = next;
    }
}