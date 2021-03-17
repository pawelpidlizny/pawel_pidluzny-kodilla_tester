package kodilla.parametrized_tests.homework.com.kodilla.mockito.homework;

import java.util.HashMap;

public class WeatherAlertService {
    public HashMap<Subscriber, Location> subscriberLocationHashMap = new HashMap<>();

    public int getMapSize() {
        return subscriberLocationHashMap.size();
    }

    public void addSubscriber(Subscriber subscriber, Location location) {
        if (this.subscriberLocationHashMap.get(subscriber) != location) {
            this.subscriberLocationHashMap.put(subscriber, location);
            subscriber.subscribeToLocation(location);
        }
    }
    public void unsubscribeLocation(Subscriber subscriber, Location location) {
        if (this.subscriberLocationHashMap.get(subscriber).equals(location))
            this.subscriberLocationHashMap.remove(subscriber, location);
        subscriber.unsubscribeLocation(location);
    }

    public void sendAlert() {
        this.subscriberLocationHashMap.forEach(Subscriber::receiveAlert);
    }

    public void sendSubscriberNotifications() {
        this.subscriberLocationHashMap.forEach((subscriber, location) -> subscriber.receiveNotification());
    }
}