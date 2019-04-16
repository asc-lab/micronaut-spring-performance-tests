package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrudveujesController {

    private final CrudveujesService crudveujesService;

    public CrudveujesController(CrudveujesService crudveujesService) {
        this.crudveujesService = crudveujesService;
    }

    @RequestMapping("/crudveujes")
    public String index() {
        return crudveujesService.getGreeting();
    }

}
