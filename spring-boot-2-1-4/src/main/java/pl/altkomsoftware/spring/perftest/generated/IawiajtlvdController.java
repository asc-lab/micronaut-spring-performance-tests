package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IawiajtlvdController {

    private final IawiajtlvdService iawiajtlvdService;

    public IawiajtlvdController(IawiajtlvdService iawiajtlvdService) {
        this.iawiajtlvdService = iawiajtlvdService;
    }

    @RequestMapping("/iawiajtlvd")
    public String index() {
        return iawiajtlvdService.getGreeting();
    }

}
