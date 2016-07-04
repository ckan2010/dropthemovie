package payment;

import java.util.List;

public interface PaymentService {
	public List<PaymentBean> list(PaymentBean payment);
	public List<PaymentBean> findByFromDate(PaymentBean pay);
	public List<PaymentBean> findByToDate(PaymentBean pay);
	public List<PaymentBean> findByName(PaymentBean pay);
	public List<PaymentBean> findByCardCopm(PaymentBean pay);
	public List<PaymentBean> findByCardNo(PaymentBean pay);
	public String paymentCancel(PaymentBean payment);
}
