package entity;

public class Penalty {
//    id,ngay,tienphat,so lan
       private String id;
       private long date;
       private int money;
       private int punsh;

    public Penalty(String id, long date, int money, int punsh) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.punsh = punsh;
    }

    public Penalty() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPunsh() {
        return punsh;
    }

    public void setPunsh(int punsh) {
        this.punsh = punsh;
    }
}
