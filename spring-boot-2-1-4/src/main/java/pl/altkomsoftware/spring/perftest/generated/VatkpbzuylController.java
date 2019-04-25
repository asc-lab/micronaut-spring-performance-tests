package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VatkpbzuylController {

    private final VatkpbzuylService vatkpbzuylService;

    public VatkpbzuylController(VatkpbzuylService vatkpbzuylService) {
        this.vatkpbzuylService = vatkpbzuylService;
    }

    @RequestMapping("/vatkpbzuyl")
    public String index() {
        return vatkpbzuylService.getGreeting();
    }

}
