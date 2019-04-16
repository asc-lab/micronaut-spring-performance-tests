package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EimqzmjyqjController {

    private final EimqzmjyqjService eimqzmjyqjService;

    public EimqzmjyqjController(EimqzmjyqjService eimqzmjyqjService) {
        this.eimqzmjyqjService = eimqzmjyqjService;
    }

    @RequestMapping("/eimqzmjyqj")
    public String index() {
        return eimqzmjyqjService.getGreeting();
    }

}
