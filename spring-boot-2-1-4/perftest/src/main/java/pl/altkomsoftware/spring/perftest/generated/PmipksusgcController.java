package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PmipksusgcController {

    private final PmipksusgcService pmipksusgcService;

    public PmipksusgcController(PmipksusgcService pmipksusgcService) {
        this.pmipksusgcService = pmipksusgcService;
    }

    @RequestMapping("/pmipksusgc")
    public String index() {
        return pmipksusgcService.getGreeting();
    }

}
