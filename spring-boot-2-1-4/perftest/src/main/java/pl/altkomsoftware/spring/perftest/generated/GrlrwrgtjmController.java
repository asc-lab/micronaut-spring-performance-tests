package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GrlrwrgtjmController {

    private final GrlrwrgtjmService grlrwrgtjmService;

    public GrlrwrgtjmController(GrlrwrgtjmService grlrwrgtjmService) {
        this.grlrwrgtjmService = grlrwrgtjmService;
    }

    @RequestMapping("/grlrwrgtjm")
    public String index() {
        return grlrwrgtjmService.getGreeting();
    }

}
