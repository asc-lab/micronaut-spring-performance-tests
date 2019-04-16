package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AkurmxoetgController {

    private final AkurmxoetgService akurmxoetgService;

    public AkurmxoetgController(AkurmxoetgService akurmxoetgService) {
        this.akurmxoetgService = akurmxoetgService;
    }

    @RequestMapping("/akurmxoetg")
    public String index() {
        return akurmxoetgService.getGreeting();
    }

}
