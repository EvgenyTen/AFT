package main.homework4.task4;

public class Application {
    public static void main(String[] args) {
        Passport passport = new Passport().setSeries("0000").setNumber("000000");
        Passport notUniquePassport = new Passport().setSeries("0000").setNumber("000000");
        Passport incorrectPassport = new Passport().setSeries("123").setNumber("12555");
        Human human = new Human().setName("Иван").setSurname("Иванов").setAge(15).setPassport(passport);


    }

}
