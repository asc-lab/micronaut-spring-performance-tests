package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EsfqnwxrmqController {

    private final EsfqnwxrmqService esfqnwxrmqService;

    public EsfqnwxrmqController(EsfqnwxrmqService esfqnwxrmqService) {
        this.esfqnwxrmqService = esfqnwxrmqService;
    }

    @RequestMapping("/esfqnwxrmq")
    public String index() {
        return esfqnwxrmqService.getGreeting();
    }

}
