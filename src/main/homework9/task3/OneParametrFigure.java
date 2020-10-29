package main.homework9.task3;

import java.util.Random;

public abstract class OneParametrFigure extends Figure {
public OneParametrFigure(){
    parametr=new Random().nextInt(10)+1;
}
}
