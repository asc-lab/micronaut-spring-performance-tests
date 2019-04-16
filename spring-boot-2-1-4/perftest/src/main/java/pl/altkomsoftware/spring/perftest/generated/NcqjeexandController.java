package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NcqjeexandController {

    private final NcqjeexandService ncqjeexandService;

    public NcqjeexandController(NcqjeexandService ncqjeexandService) {
        this.ncqjeexandService = ncqjeexandService;
    }

    @RequestMapping("/ncqjeexand")
    public String index() {
        return ncqjeexandService.getGreeting();
    }

}
