package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WgtvlbbutaController {

    private final WgtvlbbutaService wgtvlbbutaService;

    public WgtvlbbutaController(WgtvlbbutaService wgtvlbbutaService) {
        this.wgtvlbbutaService = wgtvlbbutaService;
    }

    @RequestMapping("/wgtvlbbuta")
    public String index() {
        return wgtvlbbutaService.getGreeting();
    }

}
