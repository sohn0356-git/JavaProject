package kr.co.fastcampus.eatgo.domain;

public class Restaurant {

    private String name;
    private String address;
    private Long id;

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getInformation() {
        return name + " in " +address;
    }

    public String getAddress() {
        return address;
    }
}
