package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VfksaqvbtuController {

    private final VfksaqvbtuService vfksaqvbtuService;

    public VfksaqvbtuController(VfksaqvbtuService vfksaqvbtuService) {
        this.vfksaqvbtuService = vfksaqvbtuService;
    }

    @RequestMapping("/vfksaqvbtu")
    public String index() {
        return vfksaqvbtuService.getGreeting();
    }

}
