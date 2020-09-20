package main.homework2.task7;

public class Age {
        public static void main(String[] args) {
         Age inst = new Age();
            System.out.println(inst.getAgeDescription(32));
            System.out.println(inst.getAgeDescription(52));
            System.out.println(inst.getAgeDescription(66));
            System.out.println(inst.getAgeDescription(82));
            System.out.println(inst.getAgeDescription(25));
            System.out.println(inst.getAgeDescription(44));
            System.out.println(inst.getAgeDescription(60));
            System.out.println(inst.getAgeDescription(75));
            System.out.println(inst.getAgeDescription(22));
            System.out.println(inst.getAgeDescription(119));
        }

        String getAgeDescription(int years) {
            String age = "";
            if (years >= 25 && years < 44)
                age = "молодой";
            else if (years >= 44 && years < 60)
                age= "средний";
            else if (years >= 60 && years< 75)
                age = "пожилой";
            else if (years >= 75 && years < 90)
                age = "старческий";
            else age= "неизвестный";
            return age + " возраст";
        }
}
