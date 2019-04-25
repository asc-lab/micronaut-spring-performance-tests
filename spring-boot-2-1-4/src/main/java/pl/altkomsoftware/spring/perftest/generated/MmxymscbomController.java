package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MmxymscbomController {

    private final MmxymscbomService mmxymscbomService;

    public MmxymscbomController(MmxymscbomService mmxymscbomService) {
        this.mmxymscbomService = mmxymscbomService;
    }

    @RequestMapping("/mmxymscbom")
    public String index() {
        return mmxymscbomService.getGreeting();
    }

}
