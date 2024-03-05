package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class LifecycleConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    @AfterEach
    void tearDown(){
//        applicationContext.close();
    }
    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }
}