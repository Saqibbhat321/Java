public interface Vehicle {


    void start();
    void stop();
    default void honk()
    {
        System.out.println("Vehicle Honking");
    }
}
