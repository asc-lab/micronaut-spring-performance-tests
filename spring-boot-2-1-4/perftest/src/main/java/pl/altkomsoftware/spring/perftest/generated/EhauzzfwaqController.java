package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EhauzzfwaqController {

    private final EhauzzfwaqService ehauzzfwaqService;

    public EhauzzfwaqController(EhauzzfwaqService ehauzzfwaqService) {
        this.ehauzzfwaqService = ehauzzfwaqService;
    }

    @RequestMapping("/ehauzzfwaq")
    public String index() {
        return ehauzzfwaqService.getGreeting();
    }

}
