package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IazhsjsbiuController {

    private final IazhsjsbiuService iazhsjsbiuService;

    public IazhsjsbiuController(IazhsjsbiuService iazhsjsbiuService) {
        this.iazhsjsbiuService = iazhsjsbiuService;
    }

    @RequestMapping("/iazhsjsbiu")
    public String index() {
        return iazhsjsbiuService.getGreeting();
    }

}
