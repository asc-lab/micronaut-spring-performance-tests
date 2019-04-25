package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SqvskiunaiController {

    private final SqvskiunaiService sqvskiunaiService;

    public SqvskiunaiController(SqvskiunaiService sqvskiunaiService) {
        this.sqvskiunaiService = sqvskiunaiService;
    }

    @RequestMapping("/sqvskiunai")
    public String index() {
        return sqvskiunaiService.getGreeting();
    }

}
