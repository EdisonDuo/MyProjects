package selfProjects;

import java.util.*;


public class RandomQuiz {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int points = 0;
	ArrayList<quizGenerator> quiz = new ArrayList<>();
	quiz.add(new quizGenerator("What is the name of the person who person who invented the lightbulb?", new String[] {"Thomas Edison", "Bobby Flay", "George Washington", "Bob The Builder"}, "A"));
	quiz.add(new quizGenerator("What is the first president of the United States of America?", new String[] {"Thomas Edison", "Bobby Flay", "George Washington", "Bob The Builder"}, "C"));
	quiz.add(new quizGenerator("What is the ocean furthest left of the map?", new String[] {"Alantic Ocean", "Mississippi Ocean", "Pacific Ocean", "Indian Ocean"}, "C"));
	quiz.add(new quizGenerator("What is the coding language used to code this project?", new String[] {"C++", "Java", "JavaScript", "Python"}, "B"));
	//for loop to iterate through each of the items.
	for(int i = 0; i < 4; i++) {
		quizGenerator quest = quiz.get(i);
		quest.display();
		String userChoice = kb.next();
		if(quest.wrongRight(userChoice)) {
			System.out.println("You got it right! Now on to the next question!");
			points++;
		}
		else {
			System.out.println("You got it wrong! But that's okay, let's move on to the next question!");
		}
		System.out.println("You got " + points + "/4");
	}
}
}





class quizGenerator{
	//fields
	
	private String question;
	private String[] option;
	private String answer;
	//constructor
	
	public quizGenerator(String question, String[] option, String answer){
		this.question = question;
		this.option = option;
		this.answer = answer;
	}
	//method
	
	public boolean wrongRight(String input) {
		return input.equalsIgnoreCase(answer);
	}
	
	public void display() {
		System.out.println(question);
		char posAnswers = 'A';
		System.out.println("Options:");
		for(int i = 0; i < 4; i++) {
			System.out.println(posAnswers + ". " + option[i]);
			posAnswers++;
		}

	}
}
