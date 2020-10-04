package main.homework5.task5;

public class Passport {
    private static final Passport[] PASSPORTS = new Passport[50];
    private String series;
    private String number;
    public Passport(String series, String number) throws PassportIllegalArgumentException, PassportNullPointerException, PassportAlreadyExistsException {
        this.series = series;
        this.number = number;
        if (series == null) throw new PassportSeriesNullPointerException();
        if (number == null) throw new PassportNumberNullPointerException();
        if (!series.matches("^(\\d{2})-(\\d{2})$"))
            throw new PassportSeriesArgumentException();
        if (!number.matches("^(\\d{6})$"))
            throw new PassportNumberArgumentException();
        for (int i;i< PASSPORTS.length;i++) {
            if (PASSPORTS[i] == null) break;
            if (PASSPORTS[i].series.equals(series) && PASSPORTS[i].number.equals(number))
                throw new PassportAlreadyExistsException();
        }

       // PASSPORTS[i++] = this;
        System.out.println("Паспорт с серией № "+series+" и номером № "+number+ " успешно создан");
    }
}
