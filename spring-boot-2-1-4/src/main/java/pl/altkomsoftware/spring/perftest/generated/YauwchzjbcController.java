package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YauwchzjbcController {

    private final YauwchzjbcService yauwchzjbcService;

    public YauwchzjbcController(YauwchzjbcService yauwchzjbcService) {
        this.yauwchzjbcService = yauwchzjbcService;
    }

    @RequestMapping("/yauwchzjbc")
    public String index() {
        return yauwchzjbcService.getGreeting();
    }

}
