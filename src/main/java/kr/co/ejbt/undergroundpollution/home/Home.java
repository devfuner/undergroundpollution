package kr.co.ejbt.undergroundpollution.home;

public class Home {
    private int id;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
