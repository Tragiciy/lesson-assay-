package com.lesson;

public class Field {


    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    private static final char DEFAULT_CELL_VALUE =' ';

    private static final int FIELD_SIZE = 3;

    public void showField() {
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++)  {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    public void eraseField() {
        for (int i = 0; i < FIELD_SIZE; i++ ) {
            eraseLine(i);

        }
    }


    private void showLine(int lineNumber)  {

        for(int i = 0; i < FIELD_SIZE; i++) {
            showCell(i, lineNumber );

        }


    }

    private void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");

    }

    private void eraseLine(int LineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++ ) {
            field[i][LineNumber] = DEFAULT_CELL_VALUE;

        }

    }


}




