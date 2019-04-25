package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VwzigdwaynController {

    private final VwzigdwaynService vwzigdwaynService;

    public VwzigdwaynController(VwzigdwaynService vwzigdwaynService) {
        this.vwzigdwaynService = vwzigdwaynService;
    }

    @RequestMapping("/vwzigdwayn")
    public String index() {
        return vwzigdwaynService.getGreeting();
    }

}
