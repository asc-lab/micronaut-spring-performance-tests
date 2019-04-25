package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GwcqsxbnhkController {

    private final GwcqsxbnhkService gwcqsxbnhkService;

    public GwcqsxbnhkController(GwcqsxbnhkService gwcqsxbnhkService) {
        this.gwcqsxbnhkService = gwcqsxbnhkService;
    }

    @RequestMapping("/gwcqsxbnhk")
    public String index() {
        return gwcqsxbnhkService.getGreeting();
    }

}
