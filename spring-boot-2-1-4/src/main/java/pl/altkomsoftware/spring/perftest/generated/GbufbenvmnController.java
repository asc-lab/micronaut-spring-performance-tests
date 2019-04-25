package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GbufbenvmnController {

    private final GbufbenvmnService gbufbenvmnService;

    public GbufbenvmnController(GbufbenvmnService gbufbenvmnService) {
        this.gbufbenvmnService = gbufbenvmnService;
    }

    @RequestMapping("/gbufbenvmn")
    public String index() {
        return gbufbenvmnService.getGreeting();
    }

}
