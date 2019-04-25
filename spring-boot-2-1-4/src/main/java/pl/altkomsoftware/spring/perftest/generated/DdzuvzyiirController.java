package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DdzuvzyiirController {

    private final DdzuvzyiirService ddzuvzyiirService;

    public DdzuvzyiirController(DdzuvzyiirService ddzuvzyiirService) {
        this.ddzuvzyiirService = ddzuvzyiirService;
    }

    @RequestMapping("/ddzuvzyiir")
    public String index() {
        return ddzuvzyiirService.getGreeting();
    }

}
