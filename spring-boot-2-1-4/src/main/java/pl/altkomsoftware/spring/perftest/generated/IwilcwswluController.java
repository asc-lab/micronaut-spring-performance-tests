package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IwilcwswluController {

    private final IwilcwswluService iwilcwswluService;

    public IwilcwswluController(IwilcwswluService iwilcwswluService) {
        this.iwilcwswluService = iwilcwswluService;
    }

    @RequestMapping("/iwilcwswlu")
    public String index() {
        return iwilcwswluService.getGreeting();
    }

}
