package TeamProject;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class WorkerViewer {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		WorkersParser workerParser = new WorkersParser();
		workerParser.jsonParser();
	}
}
