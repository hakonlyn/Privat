// package assignment2.issueresolver;


// import static org.junit.Assert.assertEquals;

// import java.util.ArrayList;

// import org.junit.Test;

// import score.Score;

// public class UnitTestIssueResolver{ 


// 	public static Score sc = new Score("Issue Resolver Test", 70, 70, 70);

// 	@Test
// 	public void testIssueResolver() {

// 			IssueHandler ch = new IssueHandler(5,3,1);
// 			ArrayList<Issue> calls = new ArrayList<Issue>();
// 				int i = 0;
// 				Issue s = allocateIssue(ch, Rank.HOD, i);
// 				Faculty hodHandler1 = s.getHandler();
// 				assertEquals(hodHandler1.getRank(), Rank.HOD);
// 				assertEquals(ch.getQueueSize(hodHandler1), 0);
				
// 				i = 1;
// 				s = allocateIssue(ch, Rank.STUDENT_ASSISTANT, i);
// 				Faculty handler = s.getHandler();
// 				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
// 				assertEquals(ch.getQueueSize(handler), 0);
				
// 				i = 2;
// 				s = allocateIssue(ch, Rank.STUDENT_ASSISTANT, i);
// 				handler = s.getHandler();
// 				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
// 				assertEquals(ch.getQueueSize(handler), 0);
				
// 				i = 3;
// 				s = allocateIssue(ch, Rank.HOD, i);
// 				handler = s.getHandler();
// 				//Should return null because HOD queue is full.
// 				assertEquals(handler, null);
// 				assertEquals(ch.getQueueSize(handler), 1);
				
// 				i = 4;
// 				s = allocateIssue(ch, Rank.PROFESSOR, i);
// 				handler = s.getHandler();
// 				assertEquals(handler.getRank(), Rank.PROFESSOR);
// 				assertEquals(ch.getQueueSize(handler), 0);
				
// 				i = 5;
// 				s = allocateIssue(ch, Rank.STUDENT_ASSISTANT, i);
// 				handler = s.getHandler();
// 				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
// 				assertEquals(ch.getQueueSize(handler), 0);
				
// 				//HOD is free now so check that the queue is empty.
// 				hodHandler1.issueCompleted();
// 				assertEquals(ch.getQueueSize(hodHandler1), 0);
			
// 		}


// 		private static Issue allocateIssue(IssueHandler ch, Rank rank, Integer studentid) {
// 			Issue c = createIssue(studentid);
// 			c.setRank(rank);
// 			ch.allocateIssue(c);
// 			return c;
// 		}

// 		private static Issue createIssue(int i) {
// 			Student cperson = new Student(i, Integer.toString(i));
// 			Issue c = new Issue(cperson);
// 			return c;
// 		}


// }
