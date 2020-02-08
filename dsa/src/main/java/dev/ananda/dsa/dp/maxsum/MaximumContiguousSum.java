package dev.ananda.dsa.dp.maxsum;

public class MaximumContiguousSum {

    private int[] meta;
    private int[] elements;

    public static class Result {
        private int startIndex;
        private int maxIndex;
        private int maxSum;

        public Result(int startIndex, int maxIndex, int maxSum) {
            this.startIndex = startIndex;
            this.maxIndex = maxIndex;
            this.maxSum = maxSum;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public int getMaxIndex() {
            return maxIndex;
        }

        public int getMaxSum() {
            return maxSum;
        }
    }

    public MaximumContiguousSum(int[] elements) {
        this.elements = elements;
        this.meta = new int[elements.length];
        this.prepareMeta();
    }

    public Result findMaxContiguousSum() {
        int startIndex = 0;
        int maxIndex = 0;
        int maxSum = 0;
        for (int i = 0; i < meta.length; i++) {
            if (meta[i] > maxSum) {
                maxSum = meta[i];
                maxIndex = i;
            }
        }
        startIndex = maxIndex;
        while (maxSum > 0) {
            maxSum -= elements[startIndex];
            if (maxSum != 0) {
                startIndex--;
            }
        }
        return new Result(startIndex, maxIndex, meta[maxIndex]);
    }

    private void prepareMeta() {
        if (elements[0] > 0) {
            meta[0] = elements[0];
        }
        for (int i = 1; i < elements.length; i++) {
            meta[i] = Math.max(meta[i - 1] + elements[i], 0);
        }
    }

}
