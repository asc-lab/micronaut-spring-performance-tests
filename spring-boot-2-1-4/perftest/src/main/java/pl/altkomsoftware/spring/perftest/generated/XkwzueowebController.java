package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XkwzueowebController {

    private final XkwzueowebService xkwzueowebService;

    public XkwzueowebController(XkwzueowebService xkwzueowebService) {
        this.xkwzueowebService = xkwzueowebService;
    }

    @RequestMapping("/xkwzueoweb")
    public String index() {
        return xkwzueowebService.getGreeting();
    }

}
