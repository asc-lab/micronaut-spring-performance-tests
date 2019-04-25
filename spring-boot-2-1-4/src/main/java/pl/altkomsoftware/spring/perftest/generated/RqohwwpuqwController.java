package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RqohwwpuqwController {

    private final RqohwwpuqwService rqohwwpuqwService;

    public RqohwwpuqwController(RqohwwpuqwService rqohwwpuqwService) {
        this.rqohwwpuqwService = rqohwwpuqwService;
    }

    @RequestMapping("/rqohwwpuqw")
    public String index() {
        return rqohwwpuqwService.getGreeting();
    }

}
