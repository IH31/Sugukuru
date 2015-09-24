package sugukuru.validation;

import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 
 * @author ***
 *
 * Validation Rules
 * 
 * String[] rules = new String[]{
 *	"name:max.30"
 *	"email:email"
 *	"password:"
 *	}
 *
 */
public class Validation {

	private String[] ruleArr;
	private HttpServletRequest request;
	private ArrayList<String> errCode;
	
	public Validation(HttpServletRequest request, String[] ruleArr) {
		this.request = request;
		this.ruleArr = ruleArr;
		this.errCode = new ArrayList<>();
	}
	
	public boolean createValidation() throws Exception {
		boolean validFlg = true;
		
		for(String rule : this.ruleArr) {
			String[] paramAndRules = StringUtils.split(rule, ":");
			
			if(StringUtils.contains(paramAndRules[1], "require"))
			{
				validFlg = this.require(paramAndRules[0]);
			}
			else if(StringUtils.contains(paramAndRules[1], "max"))
			{
				validFlg = this.strMax(paramAndRules[0], paramAndRules[1]);
			}
			else if(StringUtils.contains(paramAndRules[1], "min"))
			{
				validFlg = this.strMin(paramAndRules[0], paramAndRules[1]);
			}
			else if(StringUtils.contains(paramAndRules[1], "number"))
			{
				validFlg = this.number(paramAndRules[0]);
			}
			else if(StringUtils.contains(paramAndRules[1], "email"))
			{
				validFlg = this.emailRegex(paramAndRules[0]);
			}
			else if(StringUtils.contains(paramAndRules[1], "date"))
			{
				validFlg = this.dateFormat(paramAndRules[0]);
			}
			else
			{
				throw new Exception("ValidationRule >> 未定義のルールが指定されています");
			}
			
//			if(!validFlg) {	break; }
		}
		
		return validFlg;
	}
	
	public ArrayList<String> getErrCode() {
		return this.errCode;
	}
	
	private boolean require(String param) {
		if(StringUtils.isNotEmpty(request.getParameter(param))) {
			return true;
		} else {
			errCode.add("[ " + param + " ]が入力されていません");
			return false;
		}
	}
	
	private boolean strMax(String param, String rule) {
		String[] lengthNum = StringUtils.split(rule, ".");
		
		if(!StringUtils.isNumeric(lengthNum[1])) {
			throw new NumberFormatException("ValidationRule >> 最大文字数に数値が指定されていません");
		}
		
		if(StringUtils.length(request.getParameter(param)) <= Integer.parseInt(lengthNum[1])) {
			return true;
		} else {
			errCode.add("[ " + param + " ]の最大文字数は" + Integer.parseInt(lengthNum[1]) + "文字です");
			return false;
		}
	}
	
	private boolean strMin(String param, String rule) {
		String[] lengthNum = StringUtils.split(rule, ".");
		
		if(!StringUtils.isNumeric(lengthNum[1])) {
			throw new NumberFormatException("ValidationRule >> 最小文字数に数値が指定されていません");
		}
		
		if(StringUtils.length(request.getParameter(param)) >= Integer.parseInt(lengthNum[1])) {
			return true;
		} else {
			errCode.add("[ " + param + " ]の最小文字数は" + Integer.parseInt(lengthNum[1]) + "文字です");
			return false;
		}
	}
	
	private boolean number(String param) {
		if(StringUtils.isNumeric(request.getParameter(param))) {
			return true;
		} else {
			errCode.add("[ " + param + " ]は数値ではありません");
			return false;
		}
	}
	
	private boolean emailRegex(String param) {
		String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
		
		if(StringUtils.isNotEmpty(request.getParameter(param)) &&
				request.getParameter(param).matches(emailPattern)) {
			return true;
		} else {
			errCode.add("[ " + param + " ]は正しいEmailアドレスではありません");
			return false;
		}
	}
	
	private boolean dateFormat(String param) {
		String[] acceptFormats = { "yyyy-MM-dd" };
		
		try {
			DateUtils.parseDateStrictly(param, acceptFormats);
			return true;
		} catch (ParseException e) {
			e.printStackTrace();
			errCode.add("[ " + param + " ]の日付指定に誤りがあります");
			return false;
		}
	}
}
