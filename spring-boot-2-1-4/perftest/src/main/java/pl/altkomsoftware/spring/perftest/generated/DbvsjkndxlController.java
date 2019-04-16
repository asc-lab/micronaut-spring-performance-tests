package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DbvsjkndxlController {

    private final DbvsjkndxlService dbvsjkndxlService;

    public DbvsjkndxlController(DbvsjkndxlService dbvsjkndxlService) {
        this.dbvsjkndxlService = dbvsjkndxlService;
    }

    @RequestMapping("/dbvsjkndxl")
    public String index() {
        return dbvsjkndxlService.getGreeting();
    }

}
