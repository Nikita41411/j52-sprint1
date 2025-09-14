package org.example;

public class Array {
    public int getMaxValue(int[] st) {
        int max = st[0];
        for (int j : st) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public int getMinValue(int[] st) {
        int min = st[0];
        for (int j : st) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public double getAverageValue(int[] st) {
        int sum = 0;
        for (int j : st) {
            sum += j;
        }
        return (double) sum / st.length;
    }
}
