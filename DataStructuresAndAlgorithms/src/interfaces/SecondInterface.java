package interfaces;

public interface SecondInterface extends FirstInterface
{
    void Car();
    String city=null;
    String country="Australia";
    default String Country()
    {
        return country;
    }
}
