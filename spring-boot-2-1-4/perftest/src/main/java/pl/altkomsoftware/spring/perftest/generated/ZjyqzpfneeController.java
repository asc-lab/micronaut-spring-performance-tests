package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZjyqzpfneeController {

    private final ZjyqzpfneeService zjyqzpfneeService;

    public ZjyqzpfneeController(ZjyqzpfneeService zjyqzpfneeService) {
        this.zjyqzpfneeService = zjyqzpfneeService;
    }

    @RequestMapping("/zjyqzpfnee")
    public String index() {
        return zjyqzpfneeService.getGreeting();
    }

}
