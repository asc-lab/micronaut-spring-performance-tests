package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XuwjjusezeController {

    private final XuwjjusezeService xuwjjusezeService;

    public XuwjjusezeController(XuwjjusezeService xuwjjusezeService) {
        this.xuwjjusezeService = xuwjjusezeService;
    }

    @RequestMapping("/xuwjjuseze")
    public String index() {
        return xuwjjusezeService.getGreeting();
    }

}
