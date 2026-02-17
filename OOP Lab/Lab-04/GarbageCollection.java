//
public class GarbageCollection {
    
    public GarbageCollection(){
        System.out.println("Object created");
    }

    public void use(){
        System.out.println("Object used");
    }

    public static void main(String[] args) {
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();
        GarbageCollection g3 = new GarbageCollection();

        g1 = null;
        g2 = g3;
        // g1.use();
        g2.use();
        new GarbageCollection().use();
    }
}
