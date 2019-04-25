package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JordmgomdkController {

    private final JordmgomdkService jordmgomdkService;

    public JordmgomdkController(JordmgomdkService jordmgomdkService) {
        this.jordmgomdkService = jordmgomdkService;
    }

    @RequestMapping("/jordmgomdk")
    public String index() {
        return jordmgomdkService.getGreeting();
    }

}
