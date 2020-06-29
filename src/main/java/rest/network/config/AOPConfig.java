package rest.network.config;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AOPConfig {

    @Bean
    public ProxyFactory proxyFactory() {
        ProxyFactory pf = new ProxyFactory();
        pf.setOptimize(true);

        return pf;
    }
}
