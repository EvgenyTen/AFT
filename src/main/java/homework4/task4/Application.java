package homework4.task4;

public class Application {
    public static void main(String[] args) {
        Passport passport = new Passport().setSeries("3333").setNumber("333333");
        Passport notUniquePassport = new Passport().setSeries("3333").setNumber("333333");
        Passport incorrectPassport = new Passport().setSeries("111").setNumber("11111");
        Human human = new Human().setName("Иван").setSurname("Иванов").setAge(35).setPassport(passport);
    }

}
