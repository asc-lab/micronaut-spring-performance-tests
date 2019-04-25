package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AwfyliitajController {

    private final AwfyliitajService awfyliitajService;

    public AwfyliitajController(AwfyliitajService awfyliitajService) {
        this.awfyliitajService = awfyliitajService;
    }

    @RequestMapping("/awfyliitaj")
    public String index() {
        return awfyliitajService.getGreeting();
    }

}
