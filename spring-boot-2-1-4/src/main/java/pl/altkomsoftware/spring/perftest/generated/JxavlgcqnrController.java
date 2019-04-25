package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JxavlgcqnrController {

    private final JxavlgcqnrService jxavlgcqnrService;

    public JxavlgcqnrController(JxavlgcqnrService jxavlgcqnrService) {
        this.jxavlgcqnrService = jxavlgcqnrService;
    }

    @RequestMapping("/jxavlgcqnr")
    public String index() {
        return jxavlgcqnrService.getGreeting();
    }

}
