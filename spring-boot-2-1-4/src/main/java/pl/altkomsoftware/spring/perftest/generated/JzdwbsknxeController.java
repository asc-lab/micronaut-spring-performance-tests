package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JzdwbsknxeController {

    private final JzdwbsknxeService jzdwbsknxeService;

    public JzdwbsknxeController(JzdwbsknxeService jzdwbsknxeService) {
        this.jzdwbsknxeService = jzdwbsknxeService;
    }

    @RequestMapping("/jzdwbsknxe")
    public String index() {
        return jzdwbsknxeService.getGreeting();
    }

}
