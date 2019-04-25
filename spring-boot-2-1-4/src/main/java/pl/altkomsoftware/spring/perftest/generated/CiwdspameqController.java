package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CiwdspameqController {

    private final CiwdspameqService ciwdspameqService;

    public CiwdspameqController(CiwdspameqService ciwdspameqService) {
        this.ciwdspameqService = ciwdspameqService;
    }

    @RequestMapping("/ciwdspameq")
    public String index() {
        return ciwdspameqService.getGreeting();
    }

}
