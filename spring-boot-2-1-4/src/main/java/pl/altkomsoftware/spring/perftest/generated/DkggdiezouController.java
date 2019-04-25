package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DkggdiezouController {

    private final DkggdiezouService dkggdiezouService;

    public DkggdiezouController(DkggdiezouService dkggdiezouService) {
        this.dkggdiezouService = dkggdiezouService;
    }

    @RequestMapping("/dkggdiezou")
    public String index() {
        return dkggdiezouService.getGreeting();
    }

}
