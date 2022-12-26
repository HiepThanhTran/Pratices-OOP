package bth3.exercise3;

public class Product {

    protected String id;
    protected String name;
    protected String desc;
    protected String producer;
    protected double price;

    public Product(String id, String name, String desc, String producer, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.producer = producer;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
