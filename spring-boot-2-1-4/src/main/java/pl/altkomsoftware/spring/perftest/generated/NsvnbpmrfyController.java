package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NsvnbpmrfyController {

    private final NsvnbpmrfyService nsvnbpmrfyService;

    public NsvnbpmrfyController(NsvnbpmrfyService nsvnbpmrfyService) {
        this.nsvnbpmrfyService = nsvnbpmrfyService;
    }

    @RequestMapping("/nsvnbpmrfy")
    public String index() {
        return nsvnbpmrfyService.getGreeting();
    }

}
