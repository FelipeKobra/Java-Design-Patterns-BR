package design_patterns.singleton;

class DatabaseConnectionLAZY {

    private static DatabaseConnectionLAZY INSTANCE = null;

    private String connectionString;
    private String user;
    private int port;

    private DatabaseConnectionLAZY(){};

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

    // Getters
    public static DatabaseConnectionLAZY getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnectionLAZY();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }

    @Override
    public String toString() {
        return "[connectionString=" + connectionString + ", user=" + user + ", port=" + port
                + "]";
    }
}
