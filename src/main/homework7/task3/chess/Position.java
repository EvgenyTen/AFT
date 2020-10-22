package main.homework7.task3.chess;

public class Position {
    private char horizontal;
    private char vertical;

    public Position(String position){
        char horizontal=position.charAt(0);
        char vertical=position.charAt(1);
        if(horizontal<='A'|| horizontal>='H')
            throw new IllegalArgumentException();
        if(horizontal<='1'|| horizontal>='8')
            throw new IllegalArgumentException();
        if(position.length()!=2)
            throw new IllegalArgumentException();
    }

    public char getHorizontal() {
        return horizontal;
    }

    public char getVertical() {
        return vertical;
    }


    @Override
    public String toString() {
        return  String.valueOf(horizontal)+vertical;

    }
}
