package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UselrrkfqkController {

    private final UselrrkfqkService uselrrkfqkService;

    public UselrrkfqkController(UselrrkfqkService uselrrkfqkService) {
        this.uselrrkfqkService = uselrrkfqkService;
    }

    @RequestMapping("/uselrrkfqk")
    public String index() {
        return uselrrkfqkService.getGreeting();
    }

}
