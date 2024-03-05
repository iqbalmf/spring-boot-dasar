package net.iqbalfauzan.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import net.iqbalfauzan.belajarspringdasar.data.Bar;
import net.iqbalfauzan.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
@Configuration
@Slf4j
public class DependOnConfiguration {

    @Bean
    @DependsOn({
            "foo"
    })
    @Lazy
    public Bar bar() {
        log.info("New Bar");
        return new Bar();
    }
    @Bean
    public Foo foo() {
        log.info("New FOO");
        return new Foo();
    }
}
