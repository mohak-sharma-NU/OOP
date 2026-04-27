public class BusinessUser extends User{

    private boolean canPromote;

    public BusinessUser(String username, String email, String password,boolean canPromote) {
        super(username,email,password);
        this.canPromote = canPromote;
    }

    public void promotePost(Post post){
        System.out.println("Post is being promoted");
    }
}