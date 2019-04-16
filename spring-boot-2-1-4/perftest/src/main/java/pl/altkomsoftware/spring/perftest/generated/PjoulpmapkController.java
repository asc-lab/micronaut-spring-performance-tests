package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PjoulpmapkController {

    private final PjoulpmapkService pjoulpmapkService;

    public PjoulpmapkController(PjoulpmapkService pjoulpmapkService) {
        this.pjoulpmapkService = pjoulpmapkService;
    }

    @RequestMapping("/pjoulpmapk")
    public String index() {
        return pjoulpmapkService.getGreeting();
    }

}
