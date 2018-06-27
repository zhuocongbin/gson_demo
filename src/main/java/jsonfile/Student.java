package jsonfile;

import java.util.Map;

/**
 * Created by zhuocongbin
 * date 2018/6/27
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private Map<Integer, AddresEntity> addresEntities;

    public Student(int id, String name, int age, Map<Integer, AddresEntity> addresEntities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addresEntities = addresEntities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Integer, AddresEntity> getAddresEntities() {
        return addresEntities;
    }

    public void setAddresEntities(Map<Integer, AddresEntity> addresEntities) {
        this.addresEntities = addresEntities;
    }
}
