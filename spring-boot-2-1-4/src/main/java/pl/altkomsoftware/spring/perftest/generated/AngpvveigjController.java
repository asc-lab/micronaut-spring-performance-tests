package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AngpvveigjController {

    private final AngpvveigjService angpvveigjService;

    public AngpvveigjController(AngpvveigjService angpvveigjService) {
        this.angpvveigjService = angpvveigjService;
    }

    @RequestMapping("/angpvveigj")
    public String index() {
        return angpvveigjService.getGreeting();
    }

}
