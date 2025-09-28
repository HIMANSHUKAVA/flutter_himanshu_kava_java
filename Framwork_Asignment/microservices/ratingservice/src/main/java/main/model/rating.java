package main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class rating 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rating_id")
	private int id;
	@Column(name = "hotel_id")
    private int hotelid;
	@Column(name = "user_id")
	private int userid;
	@Column
	private String feedback;
	@Column
	private String ratings;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "rating [id=" + id + ", hotelid=" + hotelid + ", userid=" + userid + ", feedback=" + feedback
				+ ", ratings=" + ratings + "]";
	}
	
	
	
	
	
	
	
}
