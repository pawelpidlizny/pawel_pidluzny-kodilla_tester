package kodilla.parametrized_tests.com.kodilla.execution_model.notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Notification {


    class NotificationService {
        private final Set<Client> clients = new HashSet<>();
        private Client client;


        public void addSubscriber(Client client) {
            this.clients.add(client);
        }
        public void sendNotification(Notification notification) {
            this.clients.forEach(client -> client.receive(notification));

        }

        public void removeSubscriber(Client client) {
                this.clients.remove(client);

        }
    }
}
