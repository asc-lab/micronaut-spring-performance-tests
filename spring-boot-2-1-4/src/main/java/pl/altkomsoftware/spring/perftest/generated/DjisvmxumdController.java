package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DjisvmxumdController {

    private final DjisvmxumdService djisvmxumdService;

    public DjisvmxumdController(DjisvmxumdService djisvmxumdService) {
        this.djisvmxumdService = djisvmxumdService;
    }

    @RequestMapping("/djisvmxumd")
    public String index() {
        return djisvmxumdService.getGreeting();
    }

}
