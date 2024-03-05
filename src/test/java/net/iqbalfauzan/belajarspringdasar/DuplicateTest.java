package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
public class DuplicateTest {
    @Test
    void testDuplicateFailed() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void getBeanDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Foo foo1 = context.getBean("foo", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(foo1, foo2);
    }
}
