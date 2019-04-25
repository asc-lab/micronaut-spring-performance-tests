package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NvrylezfssController {

    private final NvrylezfssService nvrylezfssService;

    public NvrylezfssController(NvrylezfssService nvrylezfssService) {
        this.nvrylezfssService = nvrylezfssService;
    }

    @RequestMapping("/nvrylezfss")
    public String index() {
        return nvrylezfssService.getGreeting();
    }

}
