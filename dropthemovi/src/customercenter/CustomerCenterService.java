package customercenter;

import java.util.List;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :CustomerCenterService.java
 * @story  :
 */
public interface CustomerCenterService {
	public List<CustomerCenterBean> list(CustomerCenterBean csb);
	public List<CustomerCenterBean> findByName(CustomerCenterBean csb);
	public List<CustomerCenterBean> findByCategory(CustomerCenterBean csb);
	public List<CustomerCenterBean> findByQuestion(CustomerCenterBean csb);
	public List<CustomerCenterBean> findByAnswer(CustomerCenterBean csb);
	public String deleteCustomerCenter();
}