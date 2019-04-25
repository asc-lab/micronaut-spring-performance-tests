package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CgfmipdvruController {

    private final CgfmipdvruService cgfmipdvruService;

    public CgfmipdvruController(CgfmipdvruService cgfmipdvruService) {
        this.cgfmipdvruService = cgfmipdvruService;
    }

    @RequestMapping("/cgfmipdvru")
    public String index() {
        return cgfmipdvruService.getGreeting();
    }

}
