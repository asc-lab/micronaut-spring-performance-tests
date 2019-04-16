package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AeumjcqfojController {

    private final AeumjcqfojService aeumjcqfojService;

    public AeumjcqfojController(AeumjcqfojService aeumjcqfojService) {
        this.aeumjcqfojService = aeumjcqfojService;
    }

    @RequestMapping("/aeumjcqfoj")
    public String index() {
        return aeumjcqfojService.getGreeting();
    }

}
