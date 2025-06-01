/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurproje;

import java.util.Random;

/**
 *
 * @author shawa
 */
public class Mudar_Shawakh_CardClass {

    public int[][] array;
    private int rows;
    private int cols;
    private Random random;

    public Mudar_Shawakh_CardClass(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new int[rows][cols];
        random = new Random();
    }

    private void shuffleArray(int[] row) {
        for (int i = row.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = row[index];
            row[index] = row[i];
            row[i] = temp;
        }
    }

    public static boolean contains(int[][] array, int data) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] == data) {
                    return true;
                }
            }
        }
        return false;
    }

    public void generateCard() {
        for (int i = 0; i < rows; i++) {
            int zeroesCount = 0;
            for (int j = 0; j < cols; j++) {
                if (zeroesCount < 5) {
                    array[i][j] = 0;
                    zeroesCount++;
                } else {
                    array[i][j] = -1;
                }
            }
            shuffleArray(array[i]);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == 0) {
                    int minValue = j * 10 + 1;
                    int maxValue = (j + 1) * 10;
                    
                    int temp = random.nextInt(maxValue - minValue ) + minValue;
                    while (contains(array, temp)) {
                        temp = random.nextInt(maxValue - minValue ) + minValue;
                    }
                    array[i][j] = temp;
                }
            }
        }
    }
    
//    public void generateCard() {
//        for (int i = 0; i < rows; i++) {
//            int zeroesCount = 0;
//            for (int j = 0; j < cols; j++) {
//                if (zeroesCount < 5) {
//                    array[i][j] = 0;
//                    zeroesCount++;
//                } else {
//                    array[i][j] = -1;
//                }
//            }
//            shuffleArray(array[i]);
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (array[i][j] == 0) {
//                    int minValue;
//                    int maxValue;
//                    if (j == 0) {
//                        minValue = 1;
//                        maxValue = 9;
//                    }else if( j == cols - 1) {
//                        minValue = 80;
//                        maxValue = 89;
//                    } else {
//                        minValue = j * 10 + 1;
//                        maxValue = (j + 1) * 10;
//                    }
//                    int temp = random.nextInt(maxValue - minValue + 1) + minValue;
//                    while (contains(array, temp)) {
//                        temp = random.nextInt(maxValue - minValue + 1) + minValue;
//                    }
//                    array[i][j] = temp;
//                }
//            }
//        }
//    }

    public void printCard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
