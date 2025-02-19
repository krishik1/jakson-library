package pojotojson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class PojoToJsonAddress {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		Address address = new Address();
		address.setHouseNo(503);
		address.setStreet("Ramalayam");
		address.setArea("P.M.Palem");
		address.setCity("Visakhapatnam");
		address.setState("Andhra Pradesh");
		address.setCountry("India");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\Users\\User\\git\\repository-jackson\\com.example.jackson.learning\\src\\test\\resources\\payloads\\spouseaddress"),address);
		//System.out.println(spouseAddressFile);
		String spouseAddress = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(spouseAddress);
	}

}
