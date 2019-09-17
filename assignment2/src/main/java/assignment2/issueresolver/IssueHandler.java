package assignment2.issueresolver;

import java.util.ArrayList;
import java.util.List;

/* IssueHandler represents the body of the program,
 * and all issues are assigned from here 
 */
public class IssueHandler {
	private final int LEVELS = 3;


	private ArrayList<Faculty> facultyArray = new ArrayList<>();

	public int getQueueSize(Faculty emp) {
		return 0;
		
	}
	public IssueHandler(int numStudentAssistants, int numProfessors, int numHeadOfTheDepartment) {
		// Constructor:
		// Make array of faculties

		for (int i = 0; i < numStudentAssistants; i++) {
			facultyArray.add(new StudentAssistant<>(this));
		}
		for (int j = 0; j < numProfessors; j++) {
			facultyArray.add(new Professors<>(this));
		}
		for (int k = 0; k < numHeadOfTheDepartment; k++) {
			facultyArray.add(new HeadOfTheDepartment<>(this));
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
		
	}

	/*
	 * An faculty just has become free after finishing handling an issue.  Return
	 * true if we were able to assign a new issue, false otherwise.
	 */
	public boolean assignCall(Faculty emp) {
		
		return false;
	}
}
