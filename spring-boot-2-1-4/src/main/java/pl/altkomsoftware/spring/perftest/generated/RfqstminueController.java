package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RfqstminueController {

    private final RfqstminueService rfqstminueService;

    public RfqstminueController(RfqstminueService rfqstminueService) {
        this.rfqstminueService = rfqstminueService;
    }

    @RequestMapping("/rfqstminue")
    public String index() {
        return rfqstminueService.getGreeting();
    }

}
