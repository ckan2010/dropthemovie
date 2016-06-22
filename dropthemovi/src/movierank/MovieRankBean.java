package movierank;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MovieRankBean.java
 * @story  :
 */
public class MovieRankBean {
	private String name,memberId,birthDay,movieName;
	private int streamingNo,ageSpecific;
	
	public MovieRankBean(String name, String memberId, String birthDay, String movieName) {
		this.name = name;
		this.memberId = memberId;
		this.birthDay = birthDay;
		this.movieName = movieName;
	}
	public String getName() {
		return name;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getStreamingNo() {
		return streamingNo;
	}
	public void setStreamingNo(int streamingNo) {
		this.streamingNo = this.streamingNo + streamingNo;
	}
	public int getAgeSpecific() {
		return ageSpecific;
	}
	public void setAgeSpecific(int ageSpecific) {
		this.ageSpecific = ageSpecific;
	}
	
}
