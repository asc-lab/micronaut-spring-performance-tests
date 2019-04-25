package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HnqxcxpahrController {

    private final HnqxcxpahrService hnqxcxpahrService;

    public HnqxcxpahrController(HnqxcxpahrService hnqxcxpahrService) {
        this.hnqxcxpahrService = hnqxcxpahrService;
    }

    @RequestMapping("/hnqxcxpahr")
    public String index() {
        return hnqxcxpahrService.getGreeting();
    }

}
