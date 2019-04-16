package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoazufdvxkController {

    private final FoazufdvxkService foazufdvxkService;

    public FoazufdvxkController(FoazufdvxkService foazufdvxkService) {
        this.foazufdvxkService = foazufdvxkService;
    }

    @RequestMapping("/foazufdvxk")
    public String index() {
        return foazufdvxkService.getGreeting();
    }

}
