package net.iqbalfauzan.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
public class DatabaseTest {
    @Test
    void testSingleton() {
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();
        Assertions.assertSame(database1, database2);
        //Konsep SINGLETON
        //membuat objek di spring default value akan singleton
    }
}
