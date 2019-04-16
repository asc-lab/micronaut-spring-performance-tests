package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GcpesxlnreController {

    private final GcpesxlnreService gcpesxlnreService;

    public GcpesxlnreController(GcpesxlnreService gcpesxlnreService) {
        this.gcpesxlnreService = gcpesxlnreService;
    }

    @RequestMapping("/gcpesxlnre")
    public String index() {
        return gcpesxlnreService.getGreeting();
    }

}
