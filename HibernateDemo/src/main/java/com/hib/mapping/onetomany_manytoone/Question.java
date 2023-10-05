package com.hib.mapping.onetomany_manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ques")
public class Question {
@Id
	private int question_id;
	private String question;
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
	private List<Answer> answer;
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public Question(int question_id, String question, List<Answer> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
}
