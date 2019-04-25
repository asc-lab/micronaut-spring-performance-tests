package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TbevtzrtwyController {

    private final TbevtzrtwyService tbevtzrtwyService;

    public TbevtzrtwyController(TbevtzrtwyService tbevtzrtwyService) {
        this.tbevtzrtwyService = tbevtzrtwyService;
    }

    @RequestMapping("/tbevtzrtwy")
    public String index() {
        return tbevtzrtwyService.getGreeting();
    }

}
