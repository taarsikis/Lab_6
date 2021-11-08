// Modify to create connection on first call
public class Connection {
    public static Connection thisConnection = new Connection();
    private Connection() {
        
    }

    public static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection =  new Connection();
        }

        return thisConnection;
    }
}
