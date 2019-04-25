package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CvvducmoecController {

    private final CvvducmoecService cvvducmoecService;

    public CvvducmoecController(CvvducmoecService cvvducmoecService) {
        this.cvvducmoecService = cvvducmoecService;
    }

    @RequestMapping("/cvvducmoec")
    public String index() {
        return cvvducmoecService.getGreeting();
    }

}
