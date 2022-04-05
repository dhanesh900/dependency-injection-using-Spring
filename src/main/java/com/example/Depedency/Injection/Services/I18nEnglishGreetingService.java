package com.example.Depedency.Injection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"English","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hellow - English";
    }
}
