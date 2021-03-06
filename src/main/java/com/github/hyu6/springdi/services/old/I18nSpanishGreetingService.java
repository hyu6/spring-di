package com.github.hyu6.springdi.services.old;

import com.github.hyu6.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"es", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "ES greeting";
    }
}
