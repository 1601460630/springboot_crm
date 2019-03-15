package jyx.crm.domain;

public class Happiness {
    private Long id;
    private String city;
    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Happiness{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", num=" + num +
                '}';
    }
}
