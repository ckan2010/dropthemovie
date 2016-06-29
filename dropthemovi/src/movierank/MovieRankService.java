package movierank;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankService.java
 * @story  :
 */
public interface MovieRankService {
	public abstract void setMovieRank(String name, String memberId, String birthDay, String movieName);
	public void setAgeSpecific(String birthDay);
	public void setStrimingNo(int strimingno);
}
