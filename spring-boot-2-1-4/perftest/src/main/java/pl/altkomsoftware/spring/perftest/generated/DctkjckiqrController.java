package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DctkjckiqrController {

    private final DctkjckiqrService dctkjckiqrService;

    public DctkjckiqrController(DctkjckiqrService dctkjckiqrService) {
        this.dctkjckiqrService = dctkjckiqrService;
    }

    @RequestMapping("/dctkjckiqr")
    public String index() {
        return dctkjckiqrService.getGreeting();
    }

}
