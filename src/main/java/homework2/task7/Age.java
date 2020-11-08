package homework2.task7;

public class Age {
    public static void main(String[] args) {
        Age inst = new Age();
        System.out.println(inst.getDescription(32));
        System.out.println(inst.getDescription(52));
        System.out.println(inst.getDescription(66));
        System.out.println(inst.getDescription(82));
        System.out.println(inst.getDescription(25));
        System.out.println(inst.getDescription(44));
        System.out.println(inst.getDescription(60));
        System.out.println(inst.getDescription(75));
        System.out.println(inst.getDescription(22));
        System.out.println(inst.getDescription(119));
    }

    String getDescription(int years) {
        String age = "";
        if (years >= 25 && years < 44)
            age = "молодой";
        else if (years >= 44 && years < 60)
            age = "средний";
        else if (years >= 60 && years < 75)
            age = "пожилой";
        else if (years >= 75 && years < 90)
            age = "старческий";
        else age = "неизвестный";
        return age + " возраст";
    }
}
