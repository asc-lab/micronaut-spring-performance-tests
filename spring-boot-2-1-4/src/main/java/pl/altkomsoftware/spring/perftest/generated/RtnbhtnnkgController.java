package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RtnbhtnnkgController {

    private final RtnbhtnnkgService rtnbhtnnkgService;

    public RtnbhtnnkgController(RtnbhtnnkgService rtnbhtnnkgService) {
        this.rtnbhtnnkgService = rtnbhtnnkgService;
    }

    @RequestMapping("/rtnbhtnnkg")
    public String index() {
        return rtnbhtnnkgService.getGreeting();
    }

}
