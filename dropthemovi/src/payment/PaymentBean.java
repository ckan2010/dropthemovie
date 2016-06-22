package payment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentBean {
	private String name,memberId,cardCompany,cardNo,fromDate,toDate,payDate;
	private int paymentPrice;
	public PaymentBean(String name, String memberId, String cardCompany, String cardNo, String payDate,int paymentPrice) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.cardCompany = cardCompany;
		this.cardNo = cardNo;
		this.payDate = payDate;
		this.paymentPrice = paymentPrice;
	}
	public void setFromDate(String fromdate){
		this.fromDate = fromdate;
	}
	public void setTDate(String todate){
		this.toDate = todate;
	}
	public String getName(){
		return this.name;
	}
	public String getMemberId(){
		return this.memberId;
	}
	public String getCardNo(){
		return this.cardNo;
	}
	public String getFromDate(){
		return this.fromDate;
	}
	public String getToDate(){
		return this.toDate;
	}
	public String getPayDate(){
		return this.payDate;
	}
	public int getPaymentPrice(){
		return this.paymentPrice;
	}
}
