package bth3.exercise4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TermAccount extends Account {

    private Term infoDue;
    private Calendar dateDue;

    public TermAccount(String accountName, String email, String phoneNumber, double money, Term infoDue) {
        super(accountName, email, phoneNumber, money);
        this.infoDue = infoDue;
        this.dateDue = new GregorianCalendar();
        this.dateDue.add(Calendar.DAY_OF_YEAR, infoDue.getDay());
    }

    public Term getInfoDue() {
        return infoDue;
    }

    public void setInfoDue(Term infoDue) {
        this.infoDue = infoDue;
    }

    public Calendar getDateDue() {
        return dateDue;
    }

    @Override
    public boolean isDateDue() {
        return c.getTime().after(this.dateDue.getTime());
    }

    public void setDateDue(Calendar dateDue) {
        this.dateDue = dateDue;
    }

    public void calculate() {
        this.money = this.money + this.money * infoDue.getRate();
    }

    @Override
    public String toString() {
        return String.format("%s\nThông tin kỳ hạn: %s\nNgày đáo hạn: %s", super.toString(), infoDue,
            f.format(dateDue.getTime()));
    }
}