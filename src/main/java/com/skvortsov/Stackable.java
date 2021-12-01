package com.skvortsov;

public interface Stackable {
    void addElement(int element);

    int deleteElement();

    int showTopElement();

    boolean isEmpty();

    boolean isFull();
}