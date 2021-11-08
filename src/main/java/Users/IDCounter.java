package Users;

public class IDCounter {
    static int id;

    public static int generateID() {
        id += 1;
        return id;
    }
}