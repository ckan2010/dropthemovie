package movierank;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankService.java
 * @story  :
 */
public interface MovieRankService {
	public abstract void SetMovieRank(String name, String memberId, String birthDay, String movieName);
	public void SetAgeSpecific(String birthDay);
	public void SetStrimingNo(int strimingno);
}
