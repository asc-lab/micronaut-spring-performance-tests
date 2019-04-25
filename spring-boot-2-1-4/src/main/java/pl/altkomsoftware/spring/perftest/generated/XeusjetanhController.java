package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XeusjetanhController {

    private final XeusjetanhService xeusjetanhService;

    public XeusjetanhController(XeusjetanhService xeusjetanhService) {
        this.xeusjetanhService = xeusjetanhService;
    }

    @RequestMapping("/xeusjetanh")
    public String index() {
        return xeusjetanhService.getGreeting();
    }

}
