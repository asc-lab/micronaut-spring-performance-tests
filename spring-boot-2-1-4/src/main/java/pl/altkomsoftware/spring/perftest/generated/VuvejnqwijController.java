package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VuvejnqwijController {

    private final VuvejnqwijService vuvejnqwijService;

    public VuvejnqwijController(VuvejnqwijService vuvejnqwijService) {
        this.vuvejnqwijService = vuvejnqwijService;
    }

    @RequestMapping("/vuvejnqwij")
    public String index() {
        return vuvejnqwijService.getGreeting();
    }

}
