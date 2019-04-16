package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DbohmzfczuController {

    private final DbohmzfczuService dbohmzfczuService;

    public DbohmzfczuController(DbohmzfczuService dbohmzfczuService) {
        this.dbohmzfczuService = dbohmzfczuService;
    }

    @RequestMapping("/dbohmzfczu")
    public String index() {
        return dbohmzfczuService.getGreeting();
    }

}
