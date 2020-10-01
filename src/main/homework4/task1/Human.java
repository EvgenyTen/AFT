package main.homework4.task1;

import java.util.Date;

public class Human {
    private String firstName, secondName;
    private Date birthDate;

    public Human() {
       this.firstName=firstName;
       this.secondName=secondName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
