package interfaces;

public abstract interface FirstInterface
{
    int age=50;
    int height=130;
    void name(String name);
    default String hobbies()
    {
        return "Cricket";
    }
}
