package com.github.hyu6.springdi.config;

import com.github.hyu6.springdi.examplebeans.FakeDataSource;
import com.github.hyu6.springdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${dev.username}")
    String user;

    @Value("${dev.password}")
    String password;

    @Value("${dev.dburl}")
    String url;

    @Value("${dev.jms.username}")
    String jmsUsername;

    @Value("${dev.jms.password}")
    String jmsPassword;

    @Value("${dev.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
}
