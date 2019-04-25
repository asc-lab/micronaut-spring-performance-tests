package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZkhtvacpcdController {

    private final ZkhtvacpcdService zkhtvacpcdService;

    public ZkhtvacpcdController(ZkhtvacpcdService zkhtvacpcdService) {
        this.zkhtvacpcdService = zkhtvacpcdService;
    }

    @RequestMapping("/zkhtvacpcd")
    public String index() {
        return zkhtvacpcdService.getGreeting();
    }

}
