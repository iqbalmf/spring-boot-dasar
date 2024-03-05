package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
public class BeanNameTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foofirst = applicationContext.getBean("fooFirst", Foo.class);
        Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);
        Assertions.assertSame(foo, foofirst);
        Assertions.assertNotSame(foofirst, fooSecond);
    }
}
