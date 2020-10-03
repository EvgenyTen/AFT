package main.homework4.task4;

public class Unique {
    private static final Passport[] PASSPORTS = new Passport[20];
    private static int index = 0;


    public static boolean isPassportExist(String series, String number) {
        Passport passport = new Passport();
        for (int i = 0; i < PASSPORTS.length; i++) {
            if (passport == null)
                break;
            String currentSeries = passport.getSeries();
            String currentNumber = passport.getNumber();
            if (currentSeries == null || currentNumber == null)
                continue;
            if (currentSeries.equals(series) && currentNumber.equals(number)) {
                System.out.printf("Не уникален");
                return true;
            }
        }
        return false;
    }

    public static void addPassport(Passport passport) {
        PASSPORTS[index++] = passport;
    }
}
