package net.iqbalfauzan.belajarspringdasar;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
public class Database {
    private static Database database;
    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }
    private Database(){}

}
