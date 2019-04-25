package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SrumoiupuhController {

    private final SrumoiupuhService srumoiupuhService;

    public SrumoiupuhController(SrumoiupuhService srumoiupuhService) {
        this.srumoiupuhService = srumoiupuhService;
    }

    @RequestMapping("/srumoiupuh")
    public String index() {
        return srumoiupuhService.getGreeting();
    }

}
