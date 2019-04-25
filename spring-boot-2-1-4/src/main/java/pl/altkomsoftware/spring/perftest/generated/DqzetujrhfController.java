package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DqzetujrhfController {

    private final DqzetujrhfService dqzetujrhfService;

    public DqzetujrhfController(DqzetujrhfService dqzetujrhfService) {
        this.dqzetujrhfService = dqzetujrhfService;
    }

    @RequestMapping("/dqzetujrhf")
    public String index() {
        return dqzetujrhfService.getGreeting();
    }

}
