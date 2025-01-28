package jsontopojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class JsonToPojoAddress {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Address address = objectMapper.readValue(new File("C:\\Users\\User\\eclipse-workspace\\com.example.jackson.learning\\src\\test\\resources\\payloads\\address.json"), Address.class);
		System.out.println(address.getCity());
		address.setCity("Hyderabad");
		String updatedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(updatedJson);
		
	}
}
