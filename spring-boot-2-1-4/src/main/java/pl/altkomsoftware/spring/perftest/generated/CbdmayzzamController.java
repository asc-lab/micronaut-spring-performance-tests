package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CbdmayzzamController {

    private final CbdmayzzamService cbdmayzzamService;

    public CbdmayzzamController(CbdmayzzamService cbdmayzzamService) {
        this.cbdmayzzamService = cbdmayzzamService;
    }

    @RequestMapping("/cbdmayzzam")
    public String index() {
        return cbdmayzzamService.getGreeting();
    }

}
