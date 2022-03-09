package com.company;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
       this.capacity = capacity;
       this.array = new Object[capacity];
    }

    public void Add(Object data) {
        if (size >= capacity) {
            Grow();
        }
        array[size] = data;
        size++;
    }

    public void Insert(Object data, int index) {
       if(size >= capacity) {
           Grow();
       }
       for(int i = size; i > index; i--) {
           array[i] = array[i-1];
       }
       array[index] = data;
       size++;
    }

    public void Delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int)(capacity / 3)) {
                    Shrink();
                }
                break;
            }
        }
    }

    public int Search(Object data) {
        for(int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public  void Shrink() {
        int newCapacity = (int)(capacity / 3);
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
        System.out.println("*** array shrinking ***");
    }

    public void Grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
        System.out.println("*** array growing ***");
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[  " + string.substring(0, string.length() -2) + "  ]";
        }
        else  string = "[]";
        return string;
    }
}
