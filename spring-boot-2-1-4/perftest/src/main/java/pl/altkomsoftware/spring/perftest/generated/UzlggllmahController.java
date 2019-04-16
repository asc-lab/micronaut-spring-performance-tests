package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UzlggllmahController {

    private final UzlggllmahService uzlggllmahService;

    public UzlggllmahController(UzlggllmahService uzlggllmahService) {
        this.uzlggllmahService = uzlggllmahService;
    }

    @RequestMapping("/uzlggllmah")
    public String index() {
        return uzlggllmahService.getGreeting();
    }

}
