package main.homework8.task4;

import java.util.Objects;

public class Branch extends Entity {
    private String address;

    public Branch(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;
        if (!Objects.equals(address, branch.address)) return false;
        return Objects.equals(name, branch.name);
    }

    @Override
    public int hashCode() {
        int res = address != null ? address.hashCode() : 0;
        res = 31 * res + (name != null ? name.hashCode() : 0);
        return res;
    }


    @Override
    public String toString() {
        return "Branch{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
