package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Bar;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
public class DependOnTest {
    private ApplicationContext context = new AnnotationConfigApplicationContext(DependOnConfiguration.class);

    @Test
    void testDependsOn() {
        Bar bar = context.getBean(Bar.class);
    }
}
