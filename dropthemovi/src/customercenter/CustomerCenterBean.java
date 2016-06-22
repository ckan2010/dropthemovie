package customercenter;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :CustomerCenterBean.java
 * @story  :
 */
public class CustomerCenterBean {
	private String name,memberId,phoneNo,category,question,answer;
	
	public CustomerCenterBean(String name, String memberId, String phoneNo) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
