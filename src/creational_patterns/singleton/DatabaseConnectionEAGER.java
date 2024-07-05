package creational_patterns.singleton;

class DatabaseConnectionEAGER {

    public static final DatabaseConnectionEAGER INSTANCE = new DatabaseConnectionEAGER();

    private String connectionString;
    private String user;
    private int port;

    private DatabaseConnectionEAGER() {
    };

    // Setters
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "[connectionString=" + connectionString + ", user=" + user + ", port=" + port
                + "]";
    }

}
