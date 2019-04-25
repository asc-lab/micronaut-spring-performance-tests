package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AigfpfpqdzController {

    private final AigfpfpqdzService aigfpfpqdzService;

    public AigfpfpqdzController(AigfpfpqdzService aigfpfpqdzService) {
        this.aigfpfpqdzService = aigfpfpqdzService;
    }

    @RequestMapping("/aigfpfpqdz")
    public String index() {
        return aigfpfpqdzService.getGreeting();
    }

}
