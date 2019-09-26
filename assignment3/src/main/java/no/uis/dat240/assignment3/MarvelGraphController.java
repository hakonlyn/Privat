package no.uis.dat240.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.Map;
// import java.util.Scanner;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MarvelGraphController {
	// {"heroName":["heronamesNeighbour1", ...],
	// "heroName2":["heroname2sNeighbour1", ...]}
	HashMap<String, HashSet<String>> heroes = new HashMap<String, HashSet<String>>();

	public MarvelGraphController() throws FileNotFoundException {
		// TODO initialize relevant data structure to answer graph queries

		Scanner heroesScanner = new Scanner(new File("marvel-hero-network.csv"));
		while (heroesScanner.hasNextLine()) {
			
			String[] nodes = heroesScanner.nextLine().toLowerCase().split(",(?! )");
			String[] aliases = heroesScanner.nextLine().toLowerCase().split(",(?! )|/");
			
		// 	for (String alias : aliases) {
		// 		HashSet<String> neighbours = new HashSet<String>();
		// 		for (String node : nodes) {
		// 			if(this.heroes.containsKey(node)){
		// 				neighbours = this.heroes.get(alias);
		// 			}
		// 			neighbours.add(node);
		// 		}
		// 		this.heroes.put(alias, neighbours);
		// 	}
		}
		heroesScanner.close();
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping(path = "/degree", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map getNodeDegree(@RequestParam String id) {
		if (this.heroes.containsKey(id)) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("Node", id);
			map.put("Degree", this.heroes.get(id).size());
			return map;
		}
		throw new NodeNotFoundException();
	}

	@RequestMapping(value = "/neighbours")
	public ResponseEntity<Object> getNeighbours(@RequestParam String id) {
		if (this.heroes.containsKey(id)) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("Neighbours", this.heroes.get(id));
			map.put("Node", id);
			return new ResponseEntity<>(map, HttpStatus.OK);
		}
		throw new NodeNotFoundException();
	}

	@RequestMapping(value = "/checkedge")
	public ResponseEntity<Object> getNeighbours(@RequestParam String id1, String id2) {
		if (this.heroes.containsKey(id1) && this.heroes.containsKey(id1)) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("EdgeExists", this.heroes.get(id1).contains(id2));
			map.put("Node1", id1);
			map.put("Node2", id2);
			return new ResponseEntity<>(map, HttpStatus.OK);
		}
		throw new NodeNotFoundException();
	}

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Given node id not found!")
	public class NodeNotFoundException extends RuntimeException {
	}
}
