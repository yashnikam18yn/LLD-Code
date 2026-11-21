public class Connection {

    private final String connectionId;

    public Connection(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void execute() {
        System.out.println("Executing query using " + connectionId);
    }
}