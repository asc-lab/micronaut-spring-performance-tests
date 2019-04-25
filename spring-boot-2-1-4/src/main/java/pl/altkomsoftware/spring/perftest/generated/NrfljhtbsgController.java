package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NrfljhtbsgController {

    private final NrfljhtbsgService nrfljhtbsgService;

    public NrfljhtbsgController(NrfljhtbsgService nrfljhtbsgService) {
        this.nrfljhtbsgService = nrfljhtbsgService;
    }

    @RequestMapping("/nrfljhtbsg")
    public String index() {
        return nrfljhtbsgService.getGreeting();
    }

}
