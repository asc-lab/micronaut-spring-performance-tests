package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CczmzmzjdvController {

    private final CczmzmzjdvService cczmzmzjdvService;

    public CczmzmzjdvController(CczmzmzjdvService cczmzmzjdvService) {
        this.cczmzmzjdvService = cczmzmzjdvService;
    }

    @RequestMapping("/cczmzmzjdv")
    public String index() {
        return cczmzmzjdvService.getGreeting();
    }

}
