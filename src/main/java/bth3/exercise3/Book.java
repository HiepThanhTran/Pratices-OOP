package bth3.exercise3;

public class Book extends Product {

    private int page;

    public Book(String id, String name, String desc, String producer, double price, int page) {
        super(id, name, desc, producer, price);
        this.page = page;
    }

    @Override
    public String toString() {
        return String.format(
            "\nMã sản phẩm: %s\nTên sản phẩm: %s\nMô tả sản phẩm: %s\nNhà sản xuất: %s\nGiá bán: %.2f\nSố trang: %d\n"
            , id, name, desc, producer, price, page);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
