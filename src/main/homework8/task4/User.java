package main.homework8.task4;
import java.util.Objects;

public class User extends Entity {
    private  String jobTitle;

    public User(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        if(!Objects.equals(jobTitle,user.jobTitle)) return false;
        return Objects.equals(name,user.name);
    }

    @Override
    public int hashCode() {
        int res= jobTitle != null ? jobTitle.hashCode() : 0;
        res=31*res+(name!=null?name.hashCode():0);
        return res;
    }
    @Override
    public String toString() {
        return "User{" +
                "address='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
