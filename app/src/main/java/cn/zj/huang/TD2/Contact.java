package cn.zj.huang.TD2;

public class Contact {
    private String name;
    private String phoneNumber;
    private int picture;

    public Contact(String name, String phoneNumber, int picture) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
