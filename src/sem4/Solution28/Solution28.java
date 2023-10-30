package sem4.Solution28;

import java.util.ArrayList;
import java.util.List;

public class Solution28 {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount()
                    + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            this.allMoney.add(new USD(3.14));
            this.allMoney.add(new Ruble(3.14));
            this.allMoney.add(new Hryvnia(3.14));
        }
        private List<Money> allMoney;
        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

abstract class Money{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();

    public Money(double amount) {
        this.amount = amount;
    }
}
