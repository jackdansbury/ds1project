package objects;

public class Review {
	
	private String IndReviewScore,
					ReviewBodyText,
					AuthorID,
					RestaurantID,
					DatePublished;
	
	private int UpVotes;
	
	public Review(String indReviewScore, String reviewBodyText, String authorID, String restaurantID,
			String datePublished) {
		
		IndReviewScore = indReviewScore;
		ReviewBodyText = reviewBodyText;
		AuthorID = authorID;
		RestaurantID = restaurantID;
		DatePublished = datePublished;
		UpVotes = 0;
	}
	
	public void upVote() {
		UpVotes++;
	}

	public String getIndReviewScore() {
		return IndReviewScore;
	}

	public void setIndReviewScore(String indReviewScore) {
		IndReviewScore = indReviewScore;
	}

	public String getReviewBodyText() {
		return ReviewBodyText;
	}

	public void setReviewBodyText(String reviewBodyText) {
		ReviewBodyText = reviewBodyText;
	}

	public String getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(String authorID) {
		AuthorID = authorID;
	}

	public String getRestaurantID() {
		return RestaurantID;
	}

	public void setRestaurantID(String restaurantID) {
		RestaurantID = restaurantID;
	}

	public String getDatePublished() {
		return DatePublished;
	}

	public void setDatePublished(String datePublished) {
		DatePublished = datePublished;
	}

	public int getUpVotes() {
		return UpVotes;
	}

	public void setUpVotes(int upVotes) {
		UpVotes = upVotes;
	}
	
	
	
	

}
