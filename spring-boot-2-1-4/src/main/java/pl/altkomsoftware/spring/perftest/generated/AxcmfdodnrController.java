package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AxcmfdodnrController {

    private final AxcmfdodnrService axcmfdodnrService;

    public AxcmfdodnrController(AxcmfdodnrService axcmfdodnrService) {
        this.axcmfdodnrService = axcmfdodnrService;
    }

    @RequestMapping("/axcmfdodnr")
    public String index() {
        return axcmfdodnrService.getGreeting();
    }

}
