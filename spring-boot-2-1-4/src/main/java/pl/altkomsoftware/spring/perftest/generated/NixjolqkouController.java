package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NixjolqkouController {

    private final NixjolqkouService nixjolqkouService;

    public NixjolqkouController(NixjolqkouService nixjolqkouService) {
        this.nixjolqkouService = nixjolqkouService;
    }

    @RequestMapping("/nixjolqkou")
    public String index() {
        return nixjolqkouService.getGreeting();
    }

}
