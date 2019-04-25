package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GdahbjbwkvController {

    private final GdahbjbwkvService gdahbjbwkvService;

    public GdahbjbwkvController(GdahbjbwkvService gdahbjbwkvService) {
        this.gdahbjbwkvService = gdahbjbwkvService;
    }

    @RequestMapping("/gdahbjbwkv")
    public String index() {
        return gdahbjbwkvService.getGreeting();
    }

}
