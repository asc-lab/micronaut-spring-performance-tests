package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CvqiamelmrController {

    private final CvqiamelmrService cvqiamelmrService;

    public CvqiamelmrController(CvqiamelmrService cvqiamelmrService) {
        this.cvqiamelmrService = cvqiamelmrService;
    }

    @RequestMapping("/cvqiamelmr")
    public String index() {
        return cvqiamelmrService.getGreeting();
    }

}
