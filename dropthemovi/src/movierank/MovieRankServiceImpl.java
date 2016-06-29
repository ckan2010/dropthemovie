package movierank;

import java.util.Calendar;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankServiceImpl.java
 * @story  :
 */
public class MovieRankServiceImpl implements MovieRankService{
    MovieRankBean movierank;
    Calendar date = Calendar.getInstance();
	@Override
	public void setMovieRank(String name, String memberId, String birthDay, String movieName) {
		movierank = new MovieRankBean(name, memberId, birthDay, movieName);
	}
	@Override
	public void setAgeSpecific(String birthDay) {
		int age = 0,agespecifi = 0;
		age = ((date.get(Calendar.YEAR)) - Integer.parseInt(birthDay.substring(0, 4)))/10;
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
		movierank.getAgeSpecific();
	}

	@Override
	public void setStrimingNo(int strimingno) {
		movierank.setStreamingNo(strimingno);
	}

}
