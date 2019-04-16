package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MghuhvciroController {

    private final MghuhvciroService mghuhvciroService;

    public MghuhvciroController(MghuhvciroService mghuhvciroService) {
        this.mghuhvciroService = mghuhvciroService;
    }

    @RequestMapping("/mghuhvciro")
    public String index() {
        return mghuhvciroService.getGreeting();
    }

}
