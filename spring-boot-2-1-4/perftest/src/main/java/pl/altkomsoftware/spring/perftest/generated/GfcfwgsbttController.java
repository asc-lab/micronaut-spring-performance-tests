package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GfcfwgsbttController {

    private final GfcfwgsbttService gfcfwgsbttService;

    public GfcfwgsbttController(GfcfwgsbttService gfcfwgsbttService) {
        this.gfcfwgsbttService = gfcfwgsbttService;
    }

    @RequestMapping("/gfcfwgsbtt")
    public String index() {
        return gfcfwgsbttService.getGreeting();
    }

}
