package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrfnqvcsrnController {

    private final CrfnqvcsrnService crfnqvcsrnService;

    public CrfnqvcsrnController(CrfnqvcsrnService crfnqvcsrnService) {
        this.crfnqvcsrnService = crfnqvcsrnService;
    }

    @RequestMapping("/crfnqvcsrn")
    public String index() {
        return crfnqvcsrnService.getGreeting();
    }

}
