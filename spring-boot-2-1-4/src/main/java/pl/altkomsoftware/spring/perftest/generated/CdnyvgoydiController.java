package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CdnyvgoydiController {

    private final CdnyvgoydiService cdnyvgoydiService;

    public CdnyvgoydiController(CdnyvgoydiService cdnyvgoydiService) {
        this.cdnyvgoydiService = cdnyvgoydiService;
    }

    @RequestMapping("/cdnyvgoydi")
    public String index() {
        return cdnyvgoydiService.getGreeting();
    }

}
