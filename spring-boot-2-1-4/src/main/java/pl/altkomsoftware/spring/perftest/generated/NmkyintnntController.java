package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NmkyintnntController {

    private final NmkyintnntService nmkyintnntService;

    public NmkyintnntController(NmkyintnntService nmkyintnntService) {
        this.nmkyintnntService = nmkyintnntService;
    }

    @RequestMapping("/nmkyintnnt")
    public String index() {
        return nmkyintnntService.getGreeting();
    }

}
