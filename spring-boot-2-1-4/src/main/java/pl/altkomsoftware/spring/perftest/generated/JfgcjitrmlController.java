package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JfgcjitrmlController {

    private final JfgcjitrmlService jfgcjitrmlService;

    public JfgcjitrmlController(JfgcjitrmlService jfgcjitrmlService) {
        this.jfgcjitrmlService = jfgcjitrmlService;
    }

    @RequestMapping("/jfgcjitrml")
    public String index() {
        return jfgcjitrmlService.getGreeting();
    }

}
