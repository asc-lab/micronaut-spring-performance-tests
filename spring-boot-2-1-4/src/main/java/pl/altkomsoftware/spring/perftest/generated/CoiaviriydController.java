package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CoiaviriydController {

    private final CoiaviriydService coiaviriydService;

    public CoiaviriydController(CoiaviriydService coiaviriydService) {
        this.coiaviriydService = coiaviriydService;
    }

    @RequestMapping("/coiaviriyd")
    public String index() {
        return coiaviriydService.getGreeting();
    }

}
