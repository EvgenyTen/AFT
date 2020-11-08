package homework4.task4;

public class Passport {
    private String series;
    private String number;

    public Passport() {
        Unique.addPassport(this);
    }


    public Passport setSeries(String series) {
        if (Unique.isPassportExist(series, number))
            return this;
        if (series.matches("^(\\d{4})$")) {
            System.out.println("Серия 4 символа");
            this.series = series;
        } else System.out.println("Серия не 4 символа");
        return this;
    }

    public String getSeries() {
        return series;
    }

    public Passport setNumber(String number) {
        if (Unique.isPassportExist(series, number))
            return this;
        if (number.matches("^(\\d{6})$")) {
            System.out.println("Номер 6 значный");
            this.number = number;
        } else System.out.println("Номер не 6 значный");
        return this;
    }

    public String getNumber() {
        return number;
    }


}
