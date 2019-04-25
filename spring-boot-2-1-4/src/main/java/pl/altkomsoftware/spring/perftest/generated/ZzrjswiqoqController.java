package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZzrjswiqoqController {

    private final ZzrjswiqoqService zzrjswiqoqService;

    public ZzrjswiqoqController(ZzrjswiqoqService zzrjswiqoqService) {
        this.zzrjswiqoqService = zzrjswiqoqService;
    }

    @RequestMapping("/zzrjswiqoq")
    public String index() {
        return zzrjswiqoqService.getGreeting();
    }

}
