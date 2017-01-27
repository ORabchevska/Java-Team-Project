package TeamProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import TeamProject.Worker;

public class WorkersParser {

	public void jsonParser() throws JsonParseException, JsonMappingException, IOException {
		InputStream input = new FileInputStream("src/main/resources/workers.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();

		List<Worker> workers = objectMapper.readValue(input,
				typeFactory.constructCollectionType(ArrayList.class, Worker.class));

		Collections.sort(workers, new Sorting());
		
		
		for (int i = 0; i < workers.size(); i++) {
			System.out.print(workers.get(i).getName());
			System.out.print(" works as " + workers.get(i).getPosition());
			System.out.println(" and have a salary " + workers.get(i).getSalary() + "$.");
		}

	}
}
