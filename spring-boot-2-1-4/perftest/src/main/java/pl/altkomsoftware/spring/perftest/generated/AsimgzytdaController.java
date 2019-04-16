package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AsimgzytdaController {

    private final AsimgzytdaService asimgzytdaService;

    public AsimgzytdaController(AsimgzytdaService asimgzytdaService) {
        this.asimgzytdaService = asimgzytdaService;
    }

    @RequestMapping("/asimgzytda")
    public String index() {
        return asimgzytdaService.getGreeting();
    }

}
