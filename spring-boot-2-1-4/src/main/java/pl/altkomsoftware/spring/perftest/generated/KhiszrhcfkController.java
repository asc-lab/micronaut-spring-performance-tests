package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KhiszrhcfkController {

    private final KhiszrhcfkService khiszrhcfkService;

    public KhiszrhcfkController(KhiszrhcfkService khiszrhcfkService) {
        this.khiszrhcfkService = khiszrhcfkService;
    }

    @RequestMapping("/khiszrhcfk")
    public String index() {
        return khiszrhcfkService.getGreeting();
    }

}
