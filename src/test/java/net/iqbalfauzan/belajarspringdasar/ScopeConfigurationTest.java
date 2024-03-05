package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Bar;
import net.iqbalfauzan.belajarspringdasar.data.Foo;
import net.iqbalfauzan.belajarspringdasar.data.ScopeConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ScopeConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }
    @Test
    void testPrototypeScope() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo, foo3);
        Assertions.assertNotSame(foo2, foo3);
    }

    @Test
    void testDoubletonScope() {
        //cuma mengakses 2x bean
        //karena scope doubleton (customize)
        Bar bar1 = applicationContext.getBean(Bar.class);
        Bar bar2 = applicationContext.getBean(Bar.class);
        Bar bar3 = applicationContext.getBean(Bar.class);
        Bar bar4 = applicationContext.getBean(Bar.class);

     Assertions.assertSame(bar1, bar3);
     Assertions.assertSame(bar2, bar4);
     Assertions.assertNotSame(bar1, bar2);
     Assertions.assertNotSame(bar3, bar4);
    }
}