public class Main {


    public static void main(String[] args) {

        RegularUser u1 = new RegularUser("mohak","Mohak@mail.com","12345mohkak",0);

        Post posts = new Post();
        u1.addtoFeed(posts);

        u1.viewFeed();

        BusinessUser b1 = new BusinessUser("MOHAK BUSINESSMAN","Mohak@mail.com","12345mohkak",true);

        b1.promotePost(posts);


        //        RegularUser u2 = new RegularUser
    }
}