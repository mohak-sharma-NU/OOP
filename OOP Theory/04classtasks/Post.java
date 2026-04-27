public class Post{
    private String caption;
    private String imgLink;
    private boolean liked;
    private boolean viewed;
    private String Comment;

    public Post(){}

    public Post(String caption, String imgLink, boolean liked, boolean viewed, String comment) {
        this.caption = caption;
        this.imgLink = imgLink;
        this.liked = liked;
        this.viewed = viewed;
        Comment = comment;
    }

    public String getCaption() {
        return caption;
    }

    public String getImgLink() {
        return imgLink;
    }

    public boolean isLiked() {
        return liked;
    }

    public boolean isViewed() {
        return viewed;
    }

    public String getComment() {
        return Comment;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public void display(){
        System.out.println("Post Img: "+this.getImgLink()+"\nPost Caption"+this.getCaption());
    }
}