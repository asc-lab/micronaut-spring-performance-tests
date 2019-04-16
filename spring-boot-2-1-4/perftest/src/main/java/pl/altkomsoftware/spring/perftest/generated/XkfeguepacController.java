package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XkfeguepacController {

    private final XkfeguepacService xkfeguepacService;

    public XkfeguepacController(XkfeguepacService xkfeguepacService) {
        this.xkfeguepacService = xkfeguepacService;
    }

    @RequestMapping("/xkfeguepac")
    public String index() {
        return xkfeguepacService.getGreeting();
    }

}
