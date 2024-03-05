package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
@Configuration
public class BeanNameConfiguration {
    @Bean(name = "fooFirst")
    @Primary
    public Foo foo() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "fooSecond")
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }
}
