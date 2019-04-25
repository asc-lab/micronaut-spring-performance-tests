package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NmrprauautController {

    private final NmrprauautService nmrprauautService;

    public NmrprauautController(NmrprauautService nmrprauautService) {
        this.nmrprauautService = nmrprauautService;
    }

    @RequestMapping("/nmrprauaut")
    public String index() {
        return nmrprauautService.getGreeting();
    }

}
