package vaibhav.soni.eventhandling.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import vaibhav.soni.eventhandling.event.VaibhavEvent;

@Component
public class VaibhavEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    // firing event every second
    @Scheduled(fixedDelay = 1000)
    public void processSomething(){
        this.applicationEventPublisher.publishEvent(new VaibhavEvent("Vaibhav"));
    }
}
