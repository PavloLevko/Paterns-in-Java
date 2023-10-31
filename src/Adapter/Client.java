package Adapter;

public class Client {
    public static void main(String[] args) {
        Database database = new AdaptedDatabase();
        database.add();
        database.select();
        database.update();
        database.delete();
    }
}
