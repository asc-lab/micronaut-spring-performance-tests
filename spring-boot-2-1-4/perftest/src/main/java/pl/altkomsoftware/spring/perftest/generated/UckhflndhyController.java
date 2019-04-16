package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UckhflndhyController {

    private final UckhflndhyService uckhflndhyService;

    public UckhflndhyController(UckhflndhyService uckhflndhyService) {
        this.uckhflndhyService = uckhflndhyService;
    }

    @RequestMapping("/uckhflndhy")
    public String index() {
        return uckhflndhyService.getGreeting();
    }

}
