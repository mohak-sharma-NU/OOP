public class RegularUser extends User{
    private final int Limit = 5;
    private Post[] posts = new Post[5];
    private int numberOfposts = 0;

    public RegularUser(String username, String email, String password, int numberOfposts) {
        super(username,email,password);
        this.numberOfposts = 0;
    }

    public int getLimit() {
        return Limit;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public int getNumberOfposts() {
        return numberOfposts;
    }

    public void setNumberOfposts(int numberOfposts) {
        this.numberOfposts = numberOfposts;
    }

    public void viewFeed(){
        for (int i = 0 ;i<Limit;i++){
            if (posts[i] != null) {
                posts[i].display();
            }
        }
    }

    public void addtoFeed(Post post){
        for (int i = 0; i < Limit; i++) {
            posts[numberOfposts] = new Post("Hello","sijdbv.jpg",false,false,"");
            numberOfposts++;
        }
    }

    public void likePost(Post post){
        if(post!=null)
            post.setLiked(true);
        else
            System.out.println("Post does not Exist");
    }
}