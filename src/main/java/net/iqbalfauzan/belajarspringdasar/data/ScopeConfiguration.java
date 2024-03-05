package net.iqbalfauzan.belajarspringdasar.data;

import lombok.extern.slf4j.Slf4j;
import net.iqbalfauzan.belajarspringdasar.scope.DoubletonScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class ScopeConfiguration {
    @Bean
//    @Scope("singleton")
    @Scope("prototype")
    public Foo foo() {
        log.info("New FOO");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}
