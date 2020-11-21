package homework13.task2;

public class Modifiers {
    public static final Modifier <Boolean> invert=input->!input;
    public static final Modifier <Integer> absolute=Math::abs;
    public static final Modifier <String> reverse=str->new StringBuilder(str).reverse().toString();
}
