package kodilla.parametrized_tests.homework.com.kodilla.mockito.homework;

public interface Subscriber {

    void receiveAlert(Location location);

    void receiveNotification();

    void subscribeToLocation(Location location);

    void unsubscribeLocation(Location location);
}
