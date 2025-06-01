/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructurproje;

import java.util.Random;

/**
 *
 * @author shawa
 */
public class DataStructurProje {
    
    public static boolean contains(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }
    
    public static int[] generatePermutation(int number) {
        Random random = new Random();
        int[] permutation = new int[number - 1];

        for (int i = 0; i < number - 1 ; i++) {
            int x = random.nextInt(number - 1) + 1;
            while (contains(permutation, x)) {
                x = random.nextInt(number - 1) + 1;
            }
            permutation[i] = x;
        }

        return permutation;
    }

    public static void main(String[] args) {
        Mudar_Shawakh_CardClass card = new Mudar_Shawakh_CardClass(3, 9);
        card.generateCard();
        card.printCard();

        Mudar_Shawakh_CardLinkedList<Integer> c1 = new Mudar_Shawakh_CardLinkedList<>();
        Mudar_Shawakh_CardLinkedList<Integer> multiLinkedList = c1.createMultiLinkedList(card.array);
        multiLinkedList.print(multiLinkedList);
        
    }
}
