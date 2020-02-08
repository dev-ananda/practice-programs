package dev.ananda.dsa.dp.maxflowmatrix;

import dev.ananda.dsa.linkedlist.LinkedList;

public class MaxFlowJourneyInMatrix {

    private int rows, columns;
    private int[][] a;
    private int[][] meta;

    public MaxFlowJourneyInMatrix(int[][] a, int rows, int columns) {
        this.a = a;
        this.rows = rows;
        this.columns = columns;
        meta = new int[rows][columns];

        this.prepareMeta();
    }

    private void prepareMeta() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    meta[0][0] = a[0][0];
                } else if (j == 0) {
                    meta[i][j] = meta[i - 1][j] + a[i][j];
                } else if (i == 0) {
                    meta[i][j] = meta[i][j - 1] + a[i][j];
                } else {
                    meta[i][j] = a[i][j] + Math.max(meta[i - 1][j], meta[i][j - 1]);
                }
            }
        }

    }

    public static class Position {
        private int i, j;

        public Position(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "{" + i + ", " + j + "}";
        }
    }

    public LinkedList<Position> getPath() {

        LinkedList<Position> path = new LinkedList<>();
        int i = rows - 1, j = columns - 1;

        while (i >= 0 && j >= 0) {
            path.insertAtBegin(new Position(i, j));

            if (0 == i) {
                j--;
            } else if (0 == j) {
                i--;
            } else {
                if (meta[i][j - 1] > meta[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }

        }
        return path;
    }


}
