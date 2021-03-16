package mockito;

import kodilla.parametrized_tests.com.kodilla.execution_model.notification.Client;
import kodilla.parametrized_tests.com.kodilla.execution_model.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification1() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification2() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification3() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients4() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        notificationService.addSubscriber(firstClient);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber5() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification6() {
        Notification.NotificationService notificationService = new Notification.NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}