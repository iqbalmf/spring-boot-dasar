package net.iqbalfauzan.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import net.iqbalfauzan.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
@Slf4j
@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        log.info("Create new foo 2");
        return foo;
    }
}
