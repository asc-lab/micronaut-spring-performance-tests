package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SdvurollawController {

    private final SdvurollawService sdvurollawService;

    public SdvurollawController(SdvurollawService sdvurollawService) {
        this.sdvurollawService = sdvurollawService;
    }

    @RequestMapping("/sdvurollaw")
    public String index() {
        return sdvurollawService.getGreeting();
    }

}
