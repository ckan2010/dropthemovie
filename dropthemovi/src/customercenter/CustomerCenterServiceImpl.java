package customercenter;

import java.util.List;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :CustomerCenterServiceImpl.java
 * @story  :
 */
public class CustomerCenterServiceImpl implements CustomerCenterService{
	CustomerCenterBean customer = CustomerCenterBean.getInstance();
	private CustomerCenterServiceImpl() {
	}
	private static CustomerCenterServiceImpl instance = new CustomerCenterServiceImpl();
	public static CustomerCenterServiceImpl getInstance() {
		return instance;
	}
	@Override
	public List<CustomerCenterBean> list(CustomerCenterBean csb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CustomerCenterBean> findByName(CustomerCenterBean csb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CustomerCenterBean> findByCategory(CustomerCenterBean csb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CustomerCenterBean> findByQuestion(CustomerCenterBean csb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CustomerCenterBean> findByAnswer(CustomerCenterBean csb) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteCustomerCenter() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
