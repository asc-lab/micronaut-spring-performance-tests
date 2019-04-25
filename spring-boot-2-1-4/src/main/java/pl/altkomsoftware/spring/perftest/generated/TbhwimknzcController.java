package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TbhwimknzcController {

    private final TbhwimknzcService tbhwimknzcService;

    public TbhwimknzcController(TbhwimknzcService tbhwimknzcService) {
        this.tbhwimknzcService = tbhwimknzcService;
    }

    @RequestMapping("/tbhwimknzc")
    public String index() {
        return tbhwimknzcService.getGreeting();
    }

}
