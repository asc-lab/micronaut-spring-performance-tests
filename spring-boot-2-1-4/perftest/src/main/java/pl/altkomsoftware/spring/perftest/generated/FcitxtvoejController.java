package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FcitxtvoejController {

    private final FcitxtvoejService fcitxtvoejService;

    public FcitxtvoejController(FcitxtvoejService fcitxtvoejService) {
        this.fcitxtvoejService = fcitxtvoejService;
    }

    @RequestMapping("/fcitxtvoej")
    public String index() {
        return fcitxtvoejService.getGreeting();
    }

}
