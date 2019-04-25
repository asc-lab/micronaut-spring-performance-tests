package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AkegxfihamController {

    private final AkegxfihamService akegxfihamService;

    public AkegxfihamController(AkegxfihamService akegxfihamService) {
        this.akegxfihamService = akegxfihamService;
    }

    @RequestMapping("/akegxfiham")
    public String index() {
        return akegxfihamService.getGreeting();
    }

}
