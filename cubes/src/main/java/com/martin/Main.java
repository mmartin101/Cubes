package com.martin;

public class Main {
    public static final int MAX_PERM = 5;

    public static void main(String[] args) {
        PossibleAnswer possibleAnswer = FindCubes.compute(MAX_PERM);
        for (int j = 0; j < MAX_PERM; j++) {
            System.out.println(possibleAnswer.bases[j] + "^3 = " + possibleAnswer.values[j]);
        }
    }
}
