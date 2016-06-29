package customercenter;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :CustomerCenterServiceImpl.java
 * @story  :
 */
public class CustomerCenterServiceImpl implements CustomerCenterService{
	CustomerCenterBean customer;
	@Override
	public void setCustomerCenter(String name, String memberId, String phoneNo) {
		customer = new CustomerCenterBean(name, memberId, phoneNo);
	}
	@Override
	public void deleteCustomerCenter() {
		customer = null;
	}
}
