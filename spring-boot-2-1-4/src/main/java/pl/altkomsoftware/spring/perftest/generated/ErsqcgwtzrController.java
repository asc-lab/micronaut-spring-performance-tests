package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ErsqcgwtzrController {

    private final ErsqcgwtzrService ersqcgwtzrService;

    public ErsqcgwtzrController(ErsqcgwtzrService ersqcgwtzrService) {
        this.ersqcgwtzrService = ersqcgwtzrService;
    }

    @RequestMapping("/ersqcgwtzr")
    public String index() {
        return ersqcgwtzrService.getGreeting();
    }

}
