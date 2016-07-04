package payment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {
	private static PaymentServiceImpl instance = new PaymentServiceImpl();
	private PaymentServiceImpl() {
	}
	public static PaymentServiceImpl getInstance() {
		return instance;
	}
	Calendar calendar = Calendar.getInstance();
	PaymentBean payment = PaymentBean.getInstance();
	public List<PaymentBean> list(PaymentBean payment) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PaymentBean> findByFromDate(PaymentBean pay) {
		String now = new SimpleDateFormat("yyyy-MM-01").format(new Date(System.currentTimeMillis()));
		payment.setFromDate(now);
		return null;
	}
	@Override
	public List<PaymentBean> findByToDate(PaymentBean pay) {
		String now = new SimpleDateFormat("yyyy-MM-01").format(new Date(System.currentTimeMillis()));
		String currentMonth = new SimpleDateFormat("yyyy-MM").format(new Date(System.currentTimeMillis()));
		String date[] = now.split("-");
		calendar.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), 1);
		int DayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		payment.setToDate(currentMonth+"-"+DayOfMonth);
		return null;
	}
	@Override
	public List<PaymentBean> findByName(PaymentBean pay) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PaymentBean> findByCardCopm(PaymentBean pay) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PaymentBean> findByCardNo(PaymentBean pay) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String paymentCancel(PaymentBean payment) {
		// TODO Auto-generated method stub
		return null;
	}
}
