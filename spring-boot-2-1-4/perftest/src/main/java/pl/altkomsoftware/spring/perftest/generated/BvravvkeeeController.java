package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BvravvkeeeController {

    private final BvravvkeeeService bvravvkeeeService;

    public BvravvkeeeController(BvravvkeeeService bvravvkeeeService) {
        this.bvravvkeeeService = bvravvkeeeService;
    }

    @RequestMapping("/bvravvkeee")
    public String index() {
        return bvravvkeeeService.getGreeting();
    }

}
