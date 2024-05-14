package br.edu.fatec.sjc;

import java.util.Collections;
import java.util.List;

public class NumberAscOrder<E extends Number & Comparable<E>> {

    private final CustomStack<E> customStack;

    public NumberAscOrder(CustomStack<E> customStack) {
        this.customStack = customStack;
    }

    public List<E> sort() throws StackEmptyException, StackFullException {
        if (customStack.isEmpty()) {
            throw new StackEmptyException();
        }
        if (customStack.size() > 6) {
            throw new StackFullException();
        }

        List<E> elements = customStack.getElements();
        elements.sort((o1, o2) -> Double.compare(o1.doubleValue(), o2.doubleValue()));

        return elements;
    }
}
