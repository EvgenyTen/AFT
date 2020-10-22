package main.homework7.task3.chess;

public class Position {
    private char horizontal;
    private char vertical;

    public Position(String position){
        char horizontal=position.charAt(0);
        char vertical=position.charAt(1);
        if(horizontal<='A'|| horizontal>='H')
            throw new IllegalArgumentException();

    }

    public char getHorizontal() {
        return horizontal;
    }

    public char getVertical() {
        return vertical;
    }


    public void setHorizontal(char horizontal) {
        this.horizontal = horizontal;
    }

    public void setVertical(char vertical) {
        this.vertical = vertical;
    }
}
