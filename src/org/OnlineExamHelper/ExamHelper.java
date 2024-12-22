package org.OnlineExamHelper;

import org.Questions.*;
import java.util.*;

public class ExamHelper {
	List li = new LinkedList();
	List li1 = new LinkedList();
	List li2 = new LinkedList();
	int marks = 0;
	int attemptq = 0;

	public void addNewQuestions(Questions question) {
		li.add(question);
		System.out.println("\n===============================================================================");
	}

	public void show() {
		Iterator i = li.listIterator();
		while (i.hasNext()) {
			Object obj = i.next();
			Questions q = (Questions) obj;
			System.out.println(q.getId() + "\t" + q.getQuestions() + "\t" + q.getOption1() + "\t" + q.getOption2()
					+ "\t" + q.getOption3() + "\t" + q.getOption4() + "\t" + q.getAns());
		}
		System.out.println("\n===============================================================================");
	}

	public void removeQuestions(int qid) {
		for (Object obj : li) {
			Questions q = (Questions) obj;
			if (q.getId() == qid) {
				int index = li.indexOf(q);
				if (index != -1) {
					li.remove(index);
				}
			}
		}
		System.out.println("\n===============================================================================");
	}

	public void searchQuestionsName(String qname) {
		boolean found = false;
		for (Object obj : li) {
			Questions q = (Questions) obj;
			if (q.getQuestions().equals(qname)) {
				System.out.println(q.getQuestions());
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Searched Questions...........");
		} else {
			System.out.println("Questions not present here....");
		}
		System.out.println("\n===============================================================================");
	}

	public void attemptQuestions(int id, String ans) {
		for (Object obj : li) {
			Questions q = (Questions) obj;

			if (q.getId() == id && q.getAns().equals(ans)) {
				li1.add(q);
				marks++;
			}
			if (q.getId() == id && !q.getAns().equals(ans)) {
				li2.add(q);
			}
		}
		System.out.println("\n===============================================================================");
	}

	public void showResult() {
		System.out.println("Number of Corrected Questions\n");
		System.out.println("id" + "\tQuestions" + "\tAnswer");
		for (Object obj : li1) {
			Questions q = (Questions) obj;
			System.out.println(q.getId() + "\t" + q.getQuestions() + " \t\t" + q.getAns());
		}
		attemptq = li1.size() + li2.size();
		int totalq = li.size();
		System.out.println("*************************************************************");
		
		System.out.println("\nNumber of Not-Corrected Questions\n");
		System.out.println("id" + "\tQuestions" + "\tAnswer");
		for (Object obj : li2) {
			Questions q = (Questions) obj;
			System.out.println(q.getId() + "\t" + q.getQuestions() + " \t\t" + q.getAns());
		}
		
		double per=((double) marks/li.size())*100;
		System.out.println("*************************************************************");
		System.out.println("total questions ="+ li.size()+"\t\tTotal Attempt Questions = " + attemptq + "\t\tNot Attempt question=" + (totalq - attemptq));
		System.out.println("Given Marks = " + marks);
		System.out.println("Total marks = " + li.size());
		System.out.println("Total Percentage = 100" + "\tGiven Percentage = " +per);

		System.out.println("\n===============================================================================");
	}

}
