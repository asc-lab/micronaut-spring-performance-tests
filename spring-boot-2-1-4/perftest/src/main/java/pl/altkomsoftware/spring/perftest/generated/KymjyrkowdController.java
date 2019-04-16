package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KymjyrkowdController {

    private final KymjyrkowdService kymjyrkowdService;

    public KymjyrkowdController(KymjyrkowdService kymjyrkowdService) {
        this.kymjyrkowdService = kymjyrkowdService;
    }

    @RequestMapping("/kymjyrkowd")
    public String index() {
        return kymjyrkowdService.getGreeting();
    }

}
