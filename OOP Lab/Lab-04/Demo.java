public class Demo{

    public void finalize(){
        System.out.println("Destroyed");
    }
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Demo d = new Demo();
        d.finalize();
        System.gc();
        System.out.println("INSIDE");
        
    }
}