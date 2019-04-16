package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JizpyxhszgController {

    private final JizpyxhszgService jizpyxhszgService;

    public JizpyxhszgController(JizpyxhszgService jizpyxhszgService) {
        this.jizpyxhszgService = jizpyxhszgService;
    }

    @RequestMapping("/jizpyxhszg")
    public String index() {
        return jizpyxhszgService.getGreeting();
    }

}
