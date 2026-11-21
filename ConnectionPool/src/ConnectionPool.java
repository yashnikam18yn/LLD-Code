import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

    private final Queue<Connection> available;
    private final int maxPoolSize;

    public ConnectionPool(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("Pool size must be positive");
        }

        this.maxPoolSize = size;
        this.available = new LinkedList<>();

        for (int i = 1; i <= size; i++) {
            available.offer(new Connection("C" + i));
        }
    }

    //get available connection from Queue;
    public Connection acquire() {

        if (available.isEmpty()) {
            throw new RuntimeException("No connection available");
        }

        Connection connection = available.poll();

        System.out.println("Acquired: " + connection.getConnectionId());

        return connection;
    }

    //release means put connection again into the Queue
    public void release(Connection connection) {

        if (connection == null) {
            throw new IllegalArgumentException("Connection cannot be null");
        }

        if (available.size() >= maxPoolSize) {
            throw new IllegalStateException("Connection already released or pool is full");
        }

        if (available.contains(connection)) {
            throw new IllegalStateException("Connection already available");
        }

        available.offer(connection);

        System.out.println("Released: " + connection.getConnectionId());
    }
}