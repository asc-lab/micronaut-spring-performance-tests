package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmklofvraxController {

    private final EmklofvraxService emklofvraxService;

    public EmklofvraxController(EmklofvraxService emklofvraxService) {
        this.emklofvraxService = emklofvraxService;
    }

    @RequestMapping("/emklofvrax")
    public String index() {
        return emklofvraxService.getGreeting();
    }

}
