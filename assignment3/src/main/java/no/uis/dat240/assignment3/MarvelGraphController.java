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
			String line = heroesScanner.nextLine();
			String[] nodes = line.toLowerCase().split(",(?! )");
			String[] aliases = line.toLowerCase().split(",(?! )|/");
			
			for (String alias : aliases) {
				alias = alias.trim();

				HashSet<String> neighbours = new HashSet<String>();
				if(this.heroes.containsKey(alias)){
					neighbours = this.heroes.get(alias);
				}
				
				for (String node : nodes) {
					node = node.trim();
					
					boolean flag = false; 
					for (String a : node.split("/")) {
						if (a.equals(alias)) { 
							flag = true; 
							break; 
						} 
					} 
					if(!flag){
						neighbours.add(node);
					}
				}
				this.heroes.put(alias, neighbours);
			}
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
		id = id.toLowerCase();
		if (this.heroes.containsKey(id)) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("Node", id);
			map.put("Degree", this.heroes.get(id).size());
			return map;
		}
		throw new NodeNotFoundException();
	}

	@RequestMapping(value = "/neighbors", produces = "application/json;charset=UTF-8")
	public ResponseEntity<Object> getNeighbors(@RequestParam String id) {
		id = id.toLowerCase();
		if (this.heroes.containsKey(id)) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("Neighbors", this.heroes.get(id));
			map.put("Node", id);
			return new ResponseEntity<>(map, HttpStatus.OK);
		}
		throw new NodeNotFoundException();
	}

	@RequestMapping(value = "/checkedge")
	public ResponseEntity<Object> checkEdge(@RequestParam String id1, String id2) {
		id1 = id1.toLowerCase();
		id2 = id2.toLowerCase();
		if (this.heroes.containsKey(id1) && this.heroes.containsKey(id2)) {
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
