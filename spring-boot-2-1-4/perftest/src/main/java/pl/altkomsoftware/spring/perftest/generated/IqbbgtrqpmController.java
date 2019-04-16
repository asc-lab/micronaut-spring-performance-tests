package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IqbbgtrqpmController {

    private final IqbbgtrqpmService iqbbgtrqpmService;

    public IqbbgtrqpmController(IqbbgtrqpmService iqbbgtrqpmService) {
        this.iqbbgtrqpmService = iqbbgtrqpmService;
    }

    @RequestMapping("/iqbbgtrqpm")
    public String index() {
        return iqbbgtrqpmService.getGreeting();
    }

}
