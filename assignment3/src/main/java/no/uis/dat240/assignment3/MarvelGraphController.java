package no.uis.dat240.assignment3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarvelGraphController {

	public MarvelGraphController() {
		// TODO initialize relevant data structure to answer graph queries
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping(path = "/hello", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map getNodeDegree(@RequestParam String id) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("Greeting", "Hello Marvel unverse!");
		map.put("id", id);
		return map;
	}

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Given node id not found!")
	public class NodeNotFoundException extends RuntimeException {
	}
}
