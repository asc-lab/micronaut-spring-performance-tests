package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JrdfutlpsxController {

    private final JrdfutlpsxService jrdfutlpsxService;

    public JrdfutlpsxController(JrdfutlpsxService jrdfutlpsxService) {
        this.jrdfutlpsxService = jrdfutlpsxService;
    }

    @RequestMapping("/jrdfutlpsx")
    public String index() {
        return jrdfutlpsxService.getGreeting();
    }

}
