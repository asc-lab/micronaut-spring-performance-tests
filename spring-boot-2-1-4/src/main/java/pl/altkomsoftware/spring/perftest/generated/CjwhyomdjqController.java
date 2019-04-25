package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CjwhyomdjqController {

    private final CjwhyomdjqService cjwhyomdjqService;

    public CjwhyomdjqController(CjwhyomdjqService cjwhyomdjqService) {
        this.cjwhyomdjqService = cjwhyomdjqService;
    }

    @RequestMapping("/cjwhyomdjq")
    public String index() {
        return cjwhyomdjqService.getGreeting();
    }

}
