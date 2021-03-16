package kodilla.parametrized_tests.com.kodilla.execution_model.notification;

public interface Client {
    void receive(Notification notification);
}
class NotificationService {

    private Client client;

    public void addSubscriber(Client client) {
    }
    public void sendNotification(Notification notification) {
        this.client.receive(notification);
    }
}