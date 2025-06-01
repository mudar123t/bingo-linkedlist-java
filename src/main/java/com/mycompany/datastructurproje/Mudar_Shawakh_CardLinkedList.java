/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurproje;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shawa
 */
public class Mudar_Shawakh_CardLinkedList<T> {

    public Mudar_Shawakh_Node head;
    private int sizeRows;
    private int sizeCols;

    public Mudar_Shawakh_CardLinkedList() {
        head = null;
    }

    void addFirst(T data) {

        Mudar_Shawakh_Node<T> newNode = new Mudar_Shawakh_Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(T data) {
        Mudar_Shawakh_Node<T> newNode = new Mudar_Shawakh_Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Mudar_Shawakh_Node<T> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void addDown(T data) {
        Mudar_Shawakh_Node<T> newNode = new Mudar_Shawakh_Node<>(data);
        Mudar_Shawakh_Node<T> temp = head;

        while (temp.down != null) {
            temp = temp.down;
        }
        temp.down = newNode;
        head = newNode;

    }

    public void print(Mudar_Shawakh_CardLinkedList card1) {
        Mudar_Shawakh_Node<T> currentRowHead = card1.head;
        Mudar_Shawakh_Node<T> temp = card1.head;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (currentRowHead != null) {
                    if (currentRowHead.next != null) {
                        System.out.print(currentRowHead.data + " -> ");
                        currentRowHead = currentRowHead.next;
                    }else {
                        System.out.print(currentRowHead.data);
                        currentRowHead = currentRowHead.next;
                    }
                }
            }
            System.out.println("");
            currentRowHead = card1.head.down;
            card1.head = card1.head.down;
        }
        card1.head = temp;
    }

    public Mudar_Shawakh_CardLinkedList<Integer> createMultiLinkedList(int[][] array) {
        Mudar_Shawakh_CardLinkedList<Integer> ncard = new Mudar_Shawakh_CardLinkedList<>();
        int count = 0;
        Mudar_Shawakh_Node<T> temp = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != -1) {
                    if (ncard.head == null) {
                        ncard.addFirst(array[i][j]);
                        temp = ncard.head;
                        count++;
                    } else if (count < 5) {
                        ncard.addLast(array[i][j]);
                        count++;
                    } else {
                        ncard.addDown(array[i][j]);
                        count = 1;
                    }
                }
            }
        }
        ncard.head = temp;
        return ncard;
    }
    
   
    
    
     
    
}
