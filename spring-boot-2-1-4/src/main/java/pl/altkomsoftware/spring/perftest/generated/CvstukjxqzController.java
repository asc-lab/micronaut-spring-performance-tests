package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CvstukjxqzController {

    private final CvstukjxqzService cvstukjxqzService;

    public CvstukjxqzController(CvstukjxqzService cvstukjxqzService) {
        this.cvstukjxqzService = cvstukjxqzService;
    }

    @RequestMapping("/cvstukjxqz")
    public String index() {
        return cvstukjxqzService.getGreeting();
    }

}
