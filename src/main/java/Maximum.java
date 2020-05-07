package com.maximum;

public class Maximum<E extends Comparable > {

    E[] values;

    public Maximum(E... values) {
        this.values = values;
    }

    public E findMax() {
        return findMax(values);
    }

    public <E extends Comparable> E findMax(E[] values) {
        E maximum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(maximum) > 0)
                maximum = values[i];
        }
        printMax(maximum);
        return maximum;
    }

    public <E> void printMax(E max) {
        System.out.println("Maximum = " + max);
    }

}
