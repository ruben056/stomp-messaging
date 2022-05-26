package be.drs.stompmessaging.iface;

import be.drs.stompmessaging.domain.model.GreetingMsg;
import be.drs.stompmessaging.domain.model.HelloMsg;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMsg greeting(HelloMsg message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new GreetingMsg("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
