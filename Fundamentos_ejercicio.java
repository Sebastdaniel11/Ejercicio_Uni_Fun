
package com.mycompany.fundamentos_ejercicio;

import java.util.Scanner;

public class Fundamentos_ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and create the value of the variable N
        int N = scanner.nextInt();

        // Initialize and create the value of the variable max value
        int maxNumber = Integer.MIN_VALUE;

        // Iterate aboout the N number
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            // Just in case the max value will be updated 
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        // Outpot of the max number
        System.out.println(maxNumber);

        // close Scanner to avoid lossing resources
        scanner.close();
    }
}
    

