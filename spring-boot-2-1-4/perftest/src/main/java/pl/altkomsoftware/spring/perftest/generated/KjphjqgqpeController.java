package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KjphjqgqpeController {

    private final KjphjqgqpeService kjphjqgqpeService;

    public KjphjqgqpeController(KjphjqgqpeService kjphjqgqpeService) {
        this.kjphjqgqpeService = kjphjqgqpeService;
    }

    @RequestMapping("/kjphjqgqpe")
    public String index() {
        return kjphjqgqpeService.getGreeting();
    }

}
