package assignment2.issueresolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.File; // Import the File class
import java.util.Scanner;


/* IssueHandler represents the body of the program,
 * and all issues are assigned from here 
 */
public class IssueHandler {
	private final int LEVELS = 3;

	private HashMap<Integer, LinkedList> hashRank; 
	private ArrayList<Faculty> studArr ;
	private ArrayList<Faculty> profArr;
	private ArrayList<Faculty> hodArr;

	public int getQueueSize(Faculty emp) {
		return hashRank.get(emp.getRank().getValue()).size();
		
	}
	public IssueHandler(int numStudentAssistants, int numProfessors, int numHeadOfTheDepartment) {
		System.out.println(System.getProperty("user.dir"));

		System.out.println("directory: ");
		File folder1 = new File("../../test/assignment2/src/test/java/assignment2/");
		File[] listOfFiles1 = folder1.listFiles();

		for (int i = 0; i < listOfFiles1.length; i++) {
			if (listOfFiles1[i].isFile()) {
				System.out.println("File " + listOfFiles1[i].getName());
			} else if (listOfFiles1[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles1[i].getName());
			}
		}
		try {
			Scanner scanner = new Scanner(new File("../../test/assignment2/src/test/java/assignment2/ImageLabelReaderTest.java"));
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch(FileNotFoundException e){
			System.out.println("Klikka ass");
		}
		

		// Constructor:
		// Make array of faculties
		hashRank = new HashMap<Integer, LinkedList>();
		hashRank.put(Rank.STUDENT_ASSISTANT.getValue(), new LinkedList<Issue>());
		hashRank.put(Rank.PROFESSOR.getValue(), new LinkedList<Issue>());
		hashRank.put(Rank.HOD.getValue(), new LinkedList<Issue>());

		studArr = new ArrayList<Faculty>();
		profArr = new ArrayList<Faculty>();
		hodArr = new ArrayList<Faculty>();

		for (int i = 0; i < numStudentAssistants; i++) {
			studArr.add(new StudentAssistant(this));
		}
		for (int j = 0; j < numProfessors; j++) {
			profArr.add(new Professor(this));
		}
		for (int k = 0; k < numHeadOfTheDepartment; k++) {
			hodArr.add(new HeadOfTheDepartment(this));
		}
	}


	/*
	 * Routes the issue to an available faculty, or saves in a queue if no faculty
	 * available.
	 */
	public void allocateIssue(Student issueer) {
		Issue issue = new Issue(issueer);
		allocateIssue(issue);
	}

	/*
	 * Allocate the issue to an available faculty who meets the required rank for the issue, or wait in the appropriate queue
	 */
	public void allocateIssue(Issue issue) {
		int issueRank = issue.getRank().getValue();
		if (issueRank <= Rank.STUDENT_ASSISTANT.getValue()){
			for (int i=0; i < studArr.size(); i++){
				Faculty currentSa = studArr.get(i);
				if (currentSa.isFree()){
					currentSa.receiveIssue(issue);
					issue.setHandler(currentSa);
					return;
				}
			}
		}
		if (issueRank <= Rank.PROFESSOR.getValue()){
			for (int i=0; i < profArr.size(); i++){
				Faculty currentProf = profArr.get(i);
				if (currentProf.isFree()){
					currentProf.receiveIssue(issue);
					issue.setHandler(currentProf);
					return;
				}
			}
		}
		if (issueRank <= Rank.HOD.getValue()){
			for (int i = 0; i < hodArr.size(); i++) {
				Faculty currentHod = hodArr.get(i);
				if (currentHod.isFree()) {
					currentHod.receiveIssue(issue);
					issue.setHandler(currentHod);
					return;
				}
			}
		}	

		hashRank.get(issueRank).add(issue);
		
	}

	/*
	 * An faculty just has become free after finishing handling an issue.  Return
	 * true if we were able to assign a new issue, false otherwise.
	 */
	public boolean assignCall(Faculty emp) {
		
		return false;
	}
}
