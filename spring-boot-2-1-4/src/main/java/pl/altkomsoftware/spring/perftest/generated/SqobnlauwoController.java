package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SqobnlauwoController {

    private final SqobnlauwoService sqobnlauwoService;

    public SqobnlauwoController(SqobnlauwoService sqobnlauwoService) {
        this.sqobnlauwoService = sqobnlauwoService;
    }

    @RequestMapping("/sqobnlauwo")
    public String index() {
        return sqobnlauwoService.getGreeting();
    }

}
