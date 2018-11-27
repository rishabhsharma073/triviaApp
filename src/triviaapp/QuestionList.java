package triviaapp;

public class QuestionList {

	private Question[] questions;
	private int currentIndex;

	public QuestionList() {
		super();
		currentIndex = 0;
		questions = new Question[10];
	}

	public void add(Question question) {
		if (questions.length == currentIndex) {
			Question[] tempQuestion = new Question[2 * (questions.length)];
			for (int i = 0; i < questions.length; i++) {
				tempQuestion[i] = questions[i];
			}
			tempQuestion[currentIndex] = question;
			questions = tempQuestion;
			currentIndex++;

		} else {
			questions[currentIndex] = question;
			currentIndex++;
		}
	}

	public void remove(int index) {
		if (index < currentIndex && index >= 0) {
			if (index < currentIndex -1 ) {
				for (int i = index; i < currentIndex; i++) {
					questions[i] = questions[i+1];
				}

			}
			currentIndex--;
		}
	}
	
	public Question get(int index) {
		Question question = null;
		if (index < currentIndex && index >= 0) {
			question = questions[index];
		}
		return question;
	}

}
