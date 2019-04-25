package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NsuskomfrwController {

    private final NsuskomfrwService nsuskomfrwService;

    public NsuskomfrwController(NsuskomfrwService nsuskomfrwService) {
        this.nsuskomfrwService = nsuskomfrwService;
    }

    @RequestMapping("/nsuskomfrw")
    public String index() {
        return nsuskomfrwService.getGreeting();
    }

}
