package bth3.exercise3;

import java.text.SimpleDateFormat;

public class Disk extends Product {

    private String time;

    public Disk(String id, String name, String desc, String producer, double price, String time) {
        super(id, name, desc, producer, price);
        SimpleDateFormat f = new SimpleDateFormat("hh/mm/ss");
        this.time = f.format(time);
    }

    @Override
    public String toString() {
        return String.format(
            "\nMã sản phẩm: %s\nTên sản phẩm: %s\nMô tả sản phẩm: %s\nNhà sản xuất: %s\nGiá bán: %.2f\nThời gian phát: %s\n"
            , id, name, desc, producer, price, time);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        SimpleDateFormat f = new SimpleDateFormat("hh/mm/ss");
        this.time = f.format(time);
    }
}
