package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SegqmrwfoqController {

    private final SegqmrwfoqService segqmrwfoqService;

    public SegqmrwfoqController(SegqmrwfoqService segqmrwfoqService) {
        this.segqmrwfoqService = segqmrwfoqService;
    }

    @RequestMapping("/segqmrwfoq")
    public String index() {
        return segqmrwfoqService.getGreeting();
    }

}
