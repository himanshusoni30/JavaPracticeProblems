package staticpack;

public class TestFrog {
    public static void main(String[] args)
    {
//        new Frog();
//        new Frog();
//        new Frog();
        System.out.println("frogCount: "+Frog.frogCount);

        Frog f = new Frog();
        System.out.println("Using Frog Reference: "+f.frogCount);

        Frog.makeNoise();
    }
}
