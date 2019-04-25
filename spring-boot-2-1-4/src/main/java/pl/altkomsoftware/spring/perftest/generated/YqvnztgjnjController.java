package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YqvnztgjnjController {

    private final YqvnztgjnjService yqvnztgjnjService;

    public YqvnztgjnjController(YqvnztgjnjService yqvnztgjnjService) {
        this.yqvnztgjnjService = yqvnztgjnjService;
    }

    @RequestMapping("/yqvnztgjnj")
    public String index() {
        return yqvnztgjnjService.getGreeting();
    }

}
