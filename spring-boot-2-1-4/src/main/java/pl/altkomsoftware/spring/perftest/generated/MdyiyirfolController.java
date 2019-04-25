package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MdyiyirfolController {

    private final MdyiyirfolService mdyiyirfolService;

    public MdyiyirfolController(MdyiyirfolService mdyiyirfolService) {
        this.mdyiyirfolService = mdyiyirfolService;
    }

    @RequestMapping("/mdyiyirfol")
    public String index() {
        return mdyiyirfolService.getGreeting();
    }

}
