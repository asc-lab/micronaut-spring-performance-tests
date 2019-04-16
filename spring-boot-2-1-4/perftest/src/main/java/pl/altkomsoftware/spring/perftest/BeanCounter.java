package pl.altkomsoftware.spring.perftest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BeanCounter implements ApplicationListener<ApplicationStartedEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(BeanCounter.class);

    @Value("${beans.counter}")
    private boolean beansCounter;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        if(beansCounter)
            LOG.info("Loaded " + event.getApplicationContext().getBeanDefinitionCount() + " Spring beans");
    }
}
