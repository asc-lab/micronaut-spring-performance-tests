package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YkvvwdfsdoController {

    private final YkvvwdfsdoService ykvvwdfsdoService;

    public YkvvwdfsdoController(YkvvwdfsdoService ykvvwdfsdoService) {
        this.ykvvwdfsdoService = ykvvwdfsdoService;
    }

    @RequestMapping("/ykvvwdfsdo")
    public String index() {
        return ykvvwdfsdoService.getGreeting();
    }

}
