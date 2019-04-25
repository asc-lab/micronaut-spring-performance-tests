package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HdjkhokxmaController {

    private final HdjkhokxmaService hdjkhokxmaService;

    public HdjkhokxmaController(HdjkhokxmaService hdjkhokxmaService) {
        this.hdjkhokxmaService = hdjkhokxmaService;
    }

    @RequestMapping("/hdjkhokxma")
    public String index() {
        return hdjkhokxmaService.getGreeting();
    }

}
