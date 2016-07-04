package movierank;

import java.util.Calendar;
import java.util.List;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankServiceImpl.java
 * @story  :
 */
public class MovieRankServiceImpl implements MovieRankService{
    MovieRankBean movieRank = MovieRankBean.getInstance();
    Calendar date = Calendar.getInstance();
    private MovieRankServiceImpl() {
	}
    private static MovieRankServiceImpl instance = new MovieRankServiceImpl();
	public static MovieRankServiceImpl getInstance() {
		return instance;
	}
	public List<MovieRankBean> list(MovieRankBean rank) {
		return null;
	}
	public List<MovieRankBean> setAgeSpecific(MovieRankBean rank) {
		int age = 0,agespecifi = 0;
		age = ((date.get(Calendar.YEAR)) - Integer.parseInt(movieRank.getBirthDay().substring(0, 4)))/10;
		switch (age) {
		case 0:case 1:
			agespecifi = 10;
			break;
		case 2:
			agespecifi = 20;
			break;
		case 3:
			agespecifi = 30;
			break;
		default:
			agespecifi = 40;
			break;
		}
		movieRank.getAgeSpecific();
		return null;
	}
	public List<MovieRankBean> setStrimingNo(MovieRankBean rank) {
		movieRank.setStreamingNo(rank.getStreamingNo());
		return null;
	}

}
