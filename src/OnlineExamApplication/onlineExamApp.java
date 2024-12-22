package OnlineExamApplication;

import org.OnlineExamHelper.*;
import org.Questions.Questions;

import java.util.*;

public class onlineExamApp {

	public static void main(String[] args) {
		ExamHelper ex = new ExamHelper();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("case 1:Add new QUestions");
			System.out.println("case 2:View All QUestions");
			System.out.println("case 3:Remove using id QUestions ");
			System.out.println("case 4:Search Questions using name");
			System.out.println("case 5:Attempt Questions");
			System.out.println("case 6:Show Result");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				xyz.nextLine();
				System.out.println("Enter a id of questions");
				int id = xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter a Questions");
				String question = xyz.nextLine();
				System.out.println("Enter a option1");
				String option1 = xyz.nextLine();
				System.out.println("Enter a option2");
				String option2 = xyz.nextLine();
				System.out.println("Enter a option3");
				String option3 = xyz.nextLine();
				System.out.println("Enter a option4");
				String option4 = xyz.nextLine();
				System.out.println("Enter a Answer of the questions");
				String ans = xyz.nextLine();
				Questions q = new Questions();
				q.setId(id);
				q.setQuestions(question);
				q.setOption1(option1);
				q.setOption2(option2);
				q.setOption3(option3);
				q.setOption4(option4);
				q.setOption4(option4);
				q.setAns(ans);

				ex.addNewQuestions(q);
				break;
			case 2:
				ex.show();
				break;
			case 3:
				xyz.nextLine();
				System.out.println("Enter id which you want delete");
				int did=xyz.nextInt();
				ex.removeQuestions(did);
				break;
			case 4:
				xyz.nextLine();
				System.out.println("Enter a question which you want search");
				String squestions=xyz.nextLine();
				ex.searchQuestionsName(squestions);
				break;
			case 5:
				System.out.println("Enter a id of questions and ans");
				int cid=xyz.nextInt();
				xyz.nextLine();
				String cans=xyz.nextLine();
				ex.attemptQuestions(cid, cans);
				break;
			case 6:
				ex.showResult();
				break;
			default:
				System.out.println("Wrong choice please enter a coreect choice");
			}
		} while (true);
	}

}
