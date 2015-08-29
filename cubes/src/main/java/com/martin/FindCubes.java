package com.martin;

import java.util.*;

/**
 * Created by maxm on 8/29/15.
 */
public class FindCubes {

    public static PossibleAnswer compute(int maxPermutations) {
        if (maxPermutations < 1) {
            return null;
        }

        Map<String, PossibleAnswer> map = new HashMap<String, PossibleAnswer>();

        long val;
        List<String> digits;
        String key;
        PossibleAnswer possibleAnswer;
        for (long i = 1; ; i++) {
            val = (long) Math.pow(i, 3);
            digits = Arrays.asList(Long.toString(val).split(""));
            Collections.sort(digits);
            Collections.reverse(digits);
            key = join(digits);
            possibleAnswer = map.get(key);
            if (possibleAnswer == null) {
                possibleAnswer = new PossibleAnswer(maxPermutations);
                possibleAnswer.addBaseAndValue(i, val);
                map.put(key, possibleAnswer);
            } else {
                possibleAnswer.addBaseAndValue(i, val);

                if (possibleAnswer.count == maxPermutations) {
                    return possibleAnswer;
                }
            }
        }
    }

    /**
     * join strings from a list into one string, in other words a string joiner
     * @param list
     * @return
     */
    public static String join(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}