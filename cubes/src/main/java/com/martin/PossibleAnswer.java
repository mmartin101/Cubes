package com.martin;

/**
 * Created by maxm on 8/29/15.
 */
public class PossibleAnswer {
    long bases[];
    long values[];
    int count;

    public PossibleAnswer(int maxPermutations) {
        bases = new long[maxPermutations];
        values = new long[maxPermutations];
    }

    public void addBaseAndValue(long b, long v) {
        bases[count] = b;
        values[count] = v;
        count++;
    }
}
