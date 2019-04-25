package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BmzkxqhdpqController {

    private final BmzkxqhdpqService bmzkxqhdpqService;

    public BmzkxqhdpqController(BmzkxqhdpqService bmzkxqhdpqService) {
        this.bmzkxqhdpqService = bmzkxqhdpqService;
    }

    @RequestMapping("/bmzkxqhdpq")
    public String index() {
        return bmzkxqhdpqService.getGreeting();
    }

}
