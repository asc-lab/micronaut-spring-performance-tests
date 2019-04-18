package pl.altkomsoftware.micronaut.perftest;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class BeanCounter implements ApplicationEventListener<ServerStartupEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(BeanCounter.class);

    private final ApplicationContext context;
    @Property(name = "beans.counter")
    private boolean beansCounter;

    public BeanCounter(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void onApplicationEvent(ServerStartupEvent event) {
        if (beansCounter)
            LOG.info("Loaded " + context.getAllBeanDefinitions().size() + " Micronaut beans");
    }
}
