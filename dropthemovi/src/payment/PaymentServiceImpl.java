package payment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PaymentServiceImpl implements PaymentService {
	PaymentBean payment;
	Calendar calendar = Calendar.getInstance();
	@Override
	public void paymentApply(String name, String memberId, String cardCompany, String cardNo, String payDate, int paymentPrice) {
		payment = new PaymentBean(name, memberId, cardCompany, cardNo, payDate, paymentPrice);
	}
	@Override
	public void SetFromDate() {
		String now = new SimpleDateFormat("yyyy-MM-01").format(new Date(System.currentTimeMillis()));
		payment.setFromDate(now);
	}
	@Override
	public void SetToDate() {
		String now = new SimpleDateFormat("yyyy-MM-01").format(new Date(System.currentTimeMillis()));
		String currentMonth = new SimpleDateFormat("yyyy-MM").format(new Date(System.currentTimeMillis()));
		String date[] = now.split("-");
		calendar.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), 1);
		int DayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		payment.setTDate(currentMonth+"-"+DayOfMonth);
	}
	@Override
	public void paymentCancel() {
		payment = null;
	}
}
