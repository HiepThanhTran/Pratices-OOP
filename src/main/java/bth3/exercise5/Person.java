package bth3.exercise5;

public class Person {

    protected String id;
    protected String name;
    protected String origin;
    protected String gender;
    protected String phoneNumber;

    public Person() {
    }

    public Person(String id, String name, String origin, String gender, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
