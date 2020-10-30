package main.homework9.task2;

public class Action {
    public static void action(Object obj) {
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            drawable.draw();
        }
        if (obj instanceof Movable) {
            Movable movable = (Movable) obj;
            movable.move();
        }
    }
}
