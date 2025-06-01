package com.mycompany.datastructurproje;

public class Mudar_Shawakh_Node<T> {
    T data; 
    Mudar_Shawakh_Node<T> next;
    Mudar_Shawakh_Node<T> down;

    public Mudar_Shawakh_Node(T data) {
        this.data = data; 
        this.next = null;
        this.down = null;
    }
}
