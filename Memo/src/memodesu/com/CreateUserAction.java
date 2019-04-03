package memodesu.com;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware{
	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String mail;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

//		入力フォームに入力された値のチェック
	if(!(userId.equals(""))
		&&!(password.equals(""))
		&&!(familyName.equals(""))
		&&!(firstName.equals(""))
		&&!(familyNameKana.equals(""))
		&&!(firstNameKana.equals(""))
		&&!(mail.equals("")))
		{
		session.put("userId",userId);
		session.put("password",password);
		session.put("familyName",familyName);
		session.put("firstName",firstName);
		session.put("familyNameKana",familyNameKana);
		session.put("firstNameKana",firstNameKana);
		session.put("mail",mail);
//		入力された値が存在していない、入力に不備が無ければ「ユーザー入力確認画面」へ遷移

	}else if((userId.equals(""))
			&&(password.equals(""))
			&&(familyName.equals(""))
			&&(firstName.equals(""))
			&&(familyNameKana.equals(""))
			&&(firstNameKana.equals(""))
			&&(mail.equals(""))){
		setErrorMessage(errorMessage);
//		入力した値が既に存在してる(既にユーザーが存在してる)場合、メッセージと共に「ユーザー情報入力画面」へ遷移
	}else{
		setErrorMessage(errorMessage);
//		入力不備の場合、メッセージと共に「ユーザー情報入力画面」へ遷移
	}
	return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}