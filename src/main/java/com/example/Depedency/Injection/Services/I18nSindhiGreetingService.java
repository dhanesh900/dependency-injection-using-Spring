package com.example.Depedency.Injection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("sindhi")
@Service("i18nService")
public class I18nSindhiGreetingService implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "ha ada chal hall ahen -sindhi";
    }
}
