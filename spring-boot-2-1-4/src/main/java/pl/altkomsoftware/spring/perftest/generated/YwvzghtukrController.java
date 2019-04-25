package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YwvzghtukrController {

    private final YwvzghtukrService ywvzghtukrService;

    public YwvzghtukrController(YwvzghtukrService ywvzghtukrService) {
        this.ywvzghtukrService = ywvzghtukrService;
    }

    @RequestMapping("/ywvzghtukr")
    public String index() {
        return ywvzghtukrService.getGreeting();
    }

}
