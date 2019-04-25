package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BcckvpzzuyController {

    private final BcckvpzzuyService bcckvpzzuyService;

    public BcckvpzzuyController(BcckvpzzuyService bcckvpzzuyService) {
        this.bcckvpzzuyService = bcckvpzzuyService;
    }

    @RequestMapping("/bcckvpzzuy")
    public String index() {
        return bcckvpzzuyService.getGreeting();
    }

}
