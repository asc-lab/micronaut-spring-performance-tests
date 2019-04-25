package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IavroxehzeController {

    private final IavroxehzeService iavroxehzeService;

    public IavroxehzeController(IavroxehzeService iavroxehzeService) {
        this.iavroxehzeService = iavroxehzeService;
    }

    @RequestMapping("/iavroxehze")
    public String index() {
        return iavroxehzeService.getGreeting();
    }

}
