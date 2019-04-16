package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MewjzntgqvController {

    private final MewjzntgqvService mewjzntgqvService;

    public MewjzntgqvController(MewjzntgqvService mewjzntgqvService) {
        this.mewjzntgqvService = mewjzntgqvService;
    }

    @RequestMapping("/mewjzntgqv")
    public String index() {
        return mewjzntgqvService.getGreeting();
    }

}
