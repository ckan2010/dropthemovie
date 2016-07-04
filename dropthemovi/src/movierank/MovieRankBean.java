package movierank;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankBean.java
 * @story  :
 */
public class MovieRankBean {
	private String name,email,birthDay,movieName;
	private int streamingNo,ageSpecific;
	private MovieRankBean() {
	}
	private static MovieRankBean instance = new MovieRankBean();
	public static MovieRankBean getInstance() {
		return instance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getStreamingNo() {
		return streamingNo;
	}
	public void setStreamingNo(int streamingNo) {
		this.streamingNo = streamingNo;
	}
	public int getAgeSpecific() {
		return ageSpecific;
	}
	public void setAgeSpecific(int ageSpecific) {
		this.ageSpecific = ageSpecific;
	}
}
