package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IjanatcwzlController {

    private final IjanatcwzlService ijanatcwzlService;

    public IjanatcwzlController(IjanatcwzlService ijanatcwzlService) {
        this.ijanatcwzlService = ijanatcwzlService;
    }

    @RequestMapping("/ijanatcwzl")
    public String index() {
        return ijanatcwzlService.getGreeting();
    }

}
