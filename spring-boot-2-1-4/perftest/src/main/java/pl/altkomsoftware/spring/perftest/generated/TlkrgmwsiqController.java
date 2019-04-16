package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TlkrgmwsiqController {

    private final TlkrgmwsiqService tlkrgmwsiqService;

    public TlkrgmwsiqController(TlkrgmwsiqService tlkrgmwsiqService) {
        this.tlkrgmwsiqService = tlkrgmwsiqService;
    }

    @RequestMapping("/tlkrgmwsiq")
    public String index() {
        return tlkrgmwsiqService.getGreeting();
    }

}
