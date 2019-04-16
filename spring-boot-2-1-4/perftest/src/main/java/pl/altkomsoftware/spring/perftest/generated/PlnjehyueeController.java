package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PlnjehyueeController {

    private final PlnjehyueeService plnjehyueeService;

    public PlnjehyueeController(PlnjehyueeService plnjehyueeService) {
        this.plnjehyueeService = plnjehyueeService;
    }

    @RequestMapping("/plnjehyuee")
    public String index() {
        return plnjehyueeService.getGreeting();
    }

}
