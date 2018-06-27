package jsonfile;

import com.google.common.collect.Lists;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhuocongbin
 * date 2018/6/27
 */
public class ProDeserializer implements JsonDeserializer<Student> {
    @Override
    public Student deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (!jsonObject.has("id"))
            return null;
        int id = jsonObject.get("id").getAsInt();
        String name = jsonObject.get("name").getAsString();
        int age = jsonObject.get("age").getAsInt();
        AddresEntity[] addresEntities = jsonDeserializationContext.deserialize(jsonObject.get("address"), AddresEntity[].class);
        List<AddresEntity> list = Lists.newArrayList(addresEntities);
        Map<Integer, AddresEntity> map = new HashMap<>();
        list.forEach(addresEntity -> {
            map.put(addresEntity.getId(), addresEntity);
        });
        Student student = new Student(id, name, age, map);
        return student;
    }
}
