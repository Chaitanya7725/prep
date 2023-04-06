package Random;

import java.util.Comparator;

// public class pqprops implements Comparable<pqprops> {
//     private String name;
//     private Integer amount;

//     public pqprops(String name, Integer amount) {
//         this.name = name;
//         this.amount = amount;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public Integer getAmount() {
//         return amount;
//     }

//     public void setAmount(Integer amount) {
//         this.amount = amount;
//     }

//     @Override
//     public String toString() {
//         return "pqprops [name=" + name + ", amount=" + amount + "]";
//     }

//     @Override
//     public int compareTo(pqprops o) {
//         return this.amount < o.amount ? 1 : -1;
//     }

// }

public class pqprops implements Comparator<pqprops> {
    private String name;
    private Integer amount;

    public pqprops(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "pqprops [name=" + name + ", amount=" + amount + "]";
    }

    @Override
    public int compare(pqprops o1, pqprops o2) {
        return o1.amount < o2.amount ? 1 : -1;
    }

}
