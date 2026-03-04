public class Review {

    private final int reviewId;
    private int reviewerId;
    private int rating;
    private String comment;
    private String reviewDate;
    private boolean isVisible;

    private static int totalReviews = 0;

    //   CONSTRUCTORS 

    public Review(int reviewerId, int rating,String comment, String reviewDate,boolean isVisible) {

        this.reviewId = ++totalReviews;
        this.reviewerId = reviewerId;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.isVisible = isVisible;
    }
    
    //   SETTERS 

    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

    //   GETTERS 

    public int getReviewId() {
        return this.reviewId;
    }

    public int getReviewerId() {
        return this.reviewerId;
    }

    public int getRating() {
        return this.rating;
    }

    public String getComment() {
        return this.comment;
    }

    public String getReviewDate() {
        return this.reviewDate;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public static int getTotalReviews() {
        return totalReviews;
    }

    //   CLASS METHODS 

    public void hideReview() {
        this.setVisible(false);
    }

    public void updateRating(int newRating) {
        this.setRating(newRating);
    }

    public boolean isPositiveReview() {
        return this.getRating() >= 4;
    }

    public void displayReviewDetails() {
        System.out.println("\nReview ID: " + this.getReviewId() +
        "\nReview Reviewer ID: " + this.getReviewerId() +
        "\nReview Rating: " + this.getRating() +
        "\nReview Comment: " + this.getComment() +
        "\nReview Date: " + this.getReviewDate() +
        "\nReview Visible: " + this.isVisible());
    }
}