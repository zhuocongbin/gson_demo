package jsonfile;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Created by zhuocongbin
 * date 2018/6/27
 */
public class AddresDeserializer implements JsonDeserializer<AddresEntity> {
    @Override
    public AddresEntity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        if (!jsonElement.isJsonObject())
            return null;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        int id = asJsonObject.get("id").getAsInt();
        String address = asJsonObject.get("city").getAsString();
        return new AddresEntity(id, address);
    }
}
