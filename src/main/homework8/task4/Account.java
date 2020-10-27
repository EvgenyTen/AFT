package main.homework8.task4;

import java.util.Objects;

public class Account extends Entity{
    public String account;

    public Account(String name, String account) {
        super(name);
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account acc = (Account) o;
        if(!Objects.equals(account,acc.account)) return false;
        return Objects.equals(name,acc.name);
    }

    @Override
    public int hashCode() {
        int res= account != null ? account.hashCode() : 0;
        res=31*res+(name!=null?name.hashCode():0);
        return res;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
