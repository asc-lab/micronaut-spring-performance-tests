package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SgoyxbjzxrController {

    private final SgoyxbjzxrService sgoyxbjzxrService;

    public SgoyxbjzxrController(SgoyxbjzxrService sgoyxbjzxrService) {
        this.sgoyxbjzxrService = sgoyxbjzxrService;
    }

    @RequestMapping("/sgoyxbjzxr")
    public String index() {
        return sgoyxbjzxrService.getGreeting();
    }

}
