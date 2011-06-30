package com.podprogramming.jobs.werecruit.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.podprogramming.jobs.werecruit.services.QuizzService;

@ManagedBean
@SessionScoped
public class QuizzMB implements Serializable {

	private static final long serialVersionUID = -3841765853147144294L;

	private final byte[] message = { 60, 98, 114, 47, 62, 78, 111, 117, 115,
			32, 118, 111, 117, 108, 111, 110, 115, 32, 116, 114, 97, 118, 97,
			105, 108, 108, 101, 114, 32, 97, 118, 101, 99, 32, 118, 111, 117,
			115, 32, 33, 32, 69, 110, 118, 111, 121, 101, 122, 32, 110, 111,
			117, 115, 32, 118, 111, 116, 114, 101, 32, 67, 86, 44, 32, 118,
			111, 116, 114, 101, 32, 112, 97, 103, 101, 32, 103, 105, 116, 104,
			117, 98, 44, 32, 108, 39, 97, 100, 114, 101, 115, 115, 101, 32,
			100, 101, 32, 118, 111, 116, 114, 101, 32, 98, 108, 111, 103, 44,
			32, 118, 111, 116, 114, 101, 32, 99, 111, 109, 112, 116, 101, 32,
			116, 119, 105, 116, 116, 101, 114, 44, 32, 101, 116, 32, 116, 111,
			117, 116, 32, 99, 101, 32, 113, 117, 105, 32, 118, 111, 117, 115,
			32, 112, 97, 114, 97, 105, 116, 32, 105, 110, 116, 101, 114, 101,
			115, 115, 97, 110, 116, 32, 58, 60, 98, 114, 47, 62, 60, 97, 32,
			104, 114, 101, 102, 61, 34, 109, 97, 105, 108, 116, 111, 58, 114,
			101, 99, 114, 117, 105, 116, 109, 101, 110, 116, 64, 112, 111, 100,
			45, 112, 114, 111, 103, 114, 97, 109, 109, 105, 110, 103, 46, 99,
			111, 109, 34, 62, 114, 101, 99, 114, 117, 105, 116, 109, 101, 110,
			116, 64, 112, 111, 100, 45, 112, 114, 111, 103, 114, 97, 109, 109,
			105, 110, 103, 46, 99, 111, 109, 60, 47, 97, 62 };

	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;

	public String getResult() {
		return new QuizzService().checkAnswers(
				answer1 + answer2 + answer3 + answer4 + answer5).toString();
	}

	public String getMessage() {
		return new String(message);
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getAnswer5() {
		return answer5;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

}
