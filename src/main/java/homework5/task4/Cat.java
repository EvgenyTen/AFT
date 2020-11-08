package homework5.task4;

public class Cat {
    public String name;
    public int age;

    public Cat(String name, int age) throws AgeTooHighException {
        this.name = name;
        this.age = age;
        try {
            if (age < 0)
                throw new AgeUnderZeroException();
            if (age > 25)
                throw new AgeTooHighException();
        } catch (AgeUnderZeroException exception) {
            StackTraceElement element = exception.getStackTrace()[0];
            System.out.println(element);
        }
    }

}
