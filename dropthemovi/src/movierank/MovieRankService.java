package movierank;

import java.util.List;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankService.java
 * @story  :
 */
public interface MovieRankService {
	public List<MovieRankBean> list(MovieRankBean rank);
	public List<MovieRankBean> setAgeSpecific(MovieRankBean rank);
	public List<MovieRankBean> setStrimingNo(MovieRankBean rank);
}
