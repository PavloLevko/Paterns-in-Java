package Adapter;

public class AdaptedDatabase extends Application implements Database {
    @Override
    public void add() {
        addClient();
    }

    @Override
    public void select() {
        selectClient();
    }

    @Override
    public void delete() {
        deleteClient();
    }

    @Override
    public void update() {
        updateClient();
    }
}
