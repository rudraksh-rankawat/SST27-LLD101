public class DBConnection {
    
    
    static DBConnection db = new DBConnection("a");
    
    String conn;
    private DBConnection(String conn) {
        this.conn = conn;
    }
    
}