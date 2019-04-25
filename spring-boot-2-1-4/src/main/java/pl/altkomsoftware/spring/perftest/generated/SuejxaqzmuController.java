package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SuejxaqzmuController {

    private final SuejxaqzmuService suejxaqzmuService;

    public SuejxaqzmuController(SuejxaqzmuService suejxaqzmuService) {
        this.suejxaqzmuService = suejxaqzmuService;
    }

    @RequestMapping("/suejxaqzmu")
    public String index() {
        return suejxaqzmuService.getGreeting();
    }

}
