package net.iqbalfauzan.belajarspringdasar;

import net.iqbalfauzan.belajarspringdasar.data.Bar;
import net.iqbalfauzan.belajarspringdasar.data.Foo;
import net.iqbalfauzan.belajarspringdasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar
 */
@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foofirst(){
        return new Foo();
    }

    @Primary
    @Bean
    public Foo foo(){
        return new Foo();
    }


    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("foofirst") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
