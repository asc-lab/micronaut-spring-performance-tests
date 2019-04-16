package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CxglynysneController {

    private final CxglynysneService cxglynysneService;

    public CxglynysneController(CxglynysneService cxglynysneService) {
        this.cxglynysneService = cxglynysneService;
    }

    @RequestMapping("/cxglynysne")
    public String index() {
        return cxglynysneService.getGreeting();
    }

}
