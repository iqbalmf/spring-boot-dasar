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
public class PrimaryConfiguration {
    @Bean
    @Primary
    public Foo foo() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }
}
