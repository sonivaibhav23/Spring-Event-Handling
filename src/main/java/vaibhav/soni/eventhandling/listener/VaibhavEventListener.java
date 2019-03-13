package vaibhav.soni.eventhandling.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import vaibhav.soni.eventhandling.event.VaibhavEvent;

@Component
public class VaibhavEventListener {

    @EventListener
    public void processSomething(VaibhavEvent event){
        System.out.println("Event fired : "+event.getText());
    }
}
