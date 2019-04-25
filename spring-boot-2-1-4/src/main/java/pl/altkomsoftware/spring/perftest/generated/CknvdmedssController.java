package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CknvdmedssController {

    private final CknvdmedssService cknvdmedssService;

    public CknvdmedssController(CknvdmedssService cknvdmedssService) {
        this.cknvdmedssService = cknvdmedssService;
    }

    @RequestMapping("/cknvdmedss")
    public String index() {
        return cknvdmedssService.getGreeting();
    }

}
