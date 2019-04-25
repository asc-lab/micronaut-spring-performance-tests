package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DbyhbqddzmController {

    private final DbyhbqddzmService dbyhbqddzmService;

    public DbyhbqddzmController(DbyhbqddzmService dbyhbqddzmService) {
        this.dbyhbqddzmService = dbyhbqddzmService;
    }

    @RequestMapping("/dbyhbqddzm")
    public String index() {
        return dbyhbqddzmService.getGreeting();
    }

}
