package designpatterns.singleton;

enum DatabaseConnectionENUM {

    INSTANCE;

    private String connectionString;
    private String user;
    private int port;

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
