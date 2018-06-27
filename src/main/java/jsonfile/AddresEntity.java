package jsonfile;

/**
 * Created by zhuocongbin
 * date 2018/6/27
 */
public class AddresEntity {
    private int id;
    private String city;

    public AddresEntity(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
