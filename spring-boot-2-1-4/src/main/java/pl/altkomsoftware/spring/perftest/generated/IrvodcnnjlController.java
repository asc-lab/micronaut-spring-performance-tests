package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IrvodcnnjlController {

    private final IrvodcnnjlService irvodcnnjlService;

    public IrvodcnnjlController(IrvodcnnjlService irvodcnnjlService) {
        this.irvodcnnjlService = irvodcnnjlService;
    }

    @RequestMapping("/irvodcnnjl")
    public String index() {
        return irvodcnnjlService.getGreeting();
    }

}
