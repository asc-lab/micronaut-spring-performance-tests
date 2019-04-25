package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DbegaxmwkvController {

    private final DbegaxmwkvService dbegaxmwkvService;

    public DbegaxmwkvController(DbegaxmwkvService dbegaxmwkvService) {
        this.dbegaxmwkvService = dbegaxmwkvService;
    }

    @RequestMapping("/dbegaxmwkv")
    public String index() {
        return dbegaxmwkvService.getGreeting();
    }

}
