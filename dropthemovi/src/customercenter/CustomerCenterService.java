package customercenter;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :CustomerCenterService.java
 * @story  :
 */
public interface CustomerCenterService {
	public abstract void SetCustomerCenter(String name, String memberId, String phoneNo);
	public void DeleteCustomerCenter();
}
