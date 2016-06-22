package payment;

public interface PaymentService {
	public abstract void paymentApply(String name, String memberId, String cardCompany, String cardNo, String payDate,int paymentPrice);
	public void SetFromDate();
	public void SetToDate();
	public void paymentCancel();
}
