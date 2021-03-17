package mockito.homework;

import kodilla.parametrized_tests.homework.com.kodilla.mockito.homework.Location;
import kodilla.parametrized_tests.homework.com.kodilla.mockito.homework.Subscriber;
import kodilla.parametrized_tests.homework.com.kodilla.mockito.homework.WeatherAlertService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();

    // mocki
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
    Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);

    Location location = Mockito.mock(Location.class);
    Location secondLocation = Mockito.mock(Location.class);
    Location thirdLocation = Mockito.mock(Location.class);

    @Test
    public void notSubscribedSubscriberShouldNotReceiveAnything() {
        weatherAlertService.sendAlert();
        Mockito.verify(subscriber1, Mockito.never()).receiveAlert(location);
        weatherAlertService.sendSubscriberNotifications();
        Mockito.verify(subscriber1, Mockito.never()).receiveNotification();
    }

    @Test
    public void AllSubscribersShouldReceiveNotifications() {
        // napełnianie hashmapy
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(secondSubscriber, location);
        weatherAlertService.addSubscriber(thirdSubscriber, secondLocation);
        // wysłanie
        weatherAlertService.sendSubscriberNotifications();
        // weryfikacja
        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotification();
        Mockito.verify(secondSubscriber, Mockito.times(1)).receiveNotification();
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receiveNotification();
    }

    @Test
    public void subscriberCanSubscribeOnlyOneTimeToLocation() {
        //given

        //when
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(subscriber1, secondLocation);
        weatherAlertService.addSubscriber(subscriber1, secondLocation);
        weatherAlertService.addSubscriber(subscriber1, thirdLocation);
        weatherAlertService.addSubscriber(subscriber1, thirdLocation);
        //then
        Mockito.verify(subscriber1, Mockito.times(1)).subscribeToLocation(location);
        Mockito.verify(subscriber1, Mockito.times(1)).subscribeToLocation(secondLocation);
        Mockito.verify(subscriber1, Mockito.times(1)).subscribeToLocation(thirdLocation);
    }
    @Test
    public void subscriberCanUnsubscribeLocation(){
        //given

        //when
        weatherAlertService.unsubscribeLocation(subscriber1,location);
        weatherAlertService.unsubscribeLocation(subscriber1,secondLocation);
        weatherAlertService.unsubscribeLocation(subscriber1,thirdLocation);
        //then
        Mockito.verify(subscriber1, Mockito.times(1)).unsubscribeLocation(location);
        Mockito.verify(subscriber1, Mockito.times(1)).unsubscribeLocation(secondLocation);
        Mockito.verify(subscriber1, Mockito.times(1)).unsubscribeLocation(thirdLocation);
    }
    @Test
    public void subscriberReceivesAlertForLocation (){

        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(secondSubscriber, secondLocation);
        weatherAlertService.addSubscriber(thirdSubscriber, thirdLocation);

        weatherAlertService.sendAlert();

        Mockito.verify(subscriber1, Mockito.times(1)).receiveAlert(location);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receiveAlert(secondLocation);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receiveAlert(thirdLocation);
    }
}


