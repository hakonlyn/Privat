package assignment2.issueresolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


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

		// Java 7
		// System.out.println(Paths.get("").toAbsolutePath().toString());

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
				System.out.println("hod");
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
