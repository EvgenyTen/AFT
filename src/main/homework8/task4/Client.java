package main.homework8.task4;

import java.util.Objects;

public class Client extends Entity {
    private String adress;

    public Client(String name,String adress) {
        super(name);
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;
        if(!Objects.equals(adress,client.adress)) return false;
        return Objects.equals(name,client.name);
    }

    @Override
    public int hashCode() {
        int res= adress != null ? adress.hashCode() : 0;
        res=31*res+(name!=null?name.hashCode():0);
        return res;
    }

    @Override
    public String toString() {
        return "Client{" +
                "adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
