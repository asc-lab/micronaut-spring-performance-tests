package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LvizrwphuoController {

    private final LvizrwphuoService lvizrwphuoService;

    public LvizrwphuoController(LvizrwphuoService lvizrwphuoService) {
        this.lvizrwphuoService = lvizrwphuoService;
    }

    @RequestMapping("/lvizrwphuo")
    public String index() {
        return lvizrwphuoService.getGreeting();
    }

}
