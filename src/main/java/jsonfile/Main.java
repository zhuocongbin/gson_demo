package jsonfile;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by zhuocongbin
 * date 2018/6/27
 */
public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("test.json");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Student.class, new ProDeserializer());
        gsonBuilder.registerTypeAdapter(AddresEntity.class, new AddresDeserializer());
        Gson gson = gsonBuilder.create();
        Student[] students = gson.fromJson(new InputStreamReader(resourceAsStream), Student[].class);
        List<Student> list = Lists.newArrayList(students);
        list.forEach(student -> {
            System.out.println(student.getId());
            System.out.println(student.getAddresEntities().get(0).getCity());
        });
    }
}
