package jsontopojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class updateJsonWithoutPOJO {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> address = objectMapper.readValue(new File(
				"C:\\Users\\User\\eclipse-workspace\\com.example.jackson.learning\\src\\test\\resources\\payloads\\address.json"),
				new TypeReference<Map<String, Object>>() {
				});
		String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

		System.out.println(jsonString);
		address.put("houseNo", 554);
		address.put("street", "SBI Colony");
		String updatedJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

		System.out.println(updatedJsonString);
	} 
}
