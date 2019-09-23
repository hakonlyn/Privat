package assignment2.issueresolver;

/* Represents an issue from a Student. Issues have a minimum rank and are assigned to the
 * first employee who can handle that issue.
 */
public class Issue {
	/* Minimal rank of employee who can handle this issue. */
	private Rank rank;

	/* Person who is raising the issue. */
	private Student student;

	/* Employee who is handling issue. */
	private Faculty handler;

	public Faculty getHandler() {
		return handler;
	}
	
	/*Constructor with a rank specified*/
	public Issue(Student c, Rank r) {
		this.student = c;
		this.rank = r;
	}
	
	/*Constructor with a rank specified where you can set a default rank which may be changed later with setRank*/
	public Issue(Student c) {
		this.student = c;
		this.rank = Rank.STUDENT_ASSISTANT;
	}

	/* Set employee who is handling call. */
	public void setHandler(Faculty e) {
		handler = e;
	}

	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank r) {
		rank = r;
	}

	
}
