package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ErdebzitlzController {

    private final ErdebzitlzService erdebzitlzService;

    public ErdebzitlzController(ErdebzitlzService erdebzitlzService) {
        this.erdebzitlzService = erdebzitlzService;
    }

    @RequestMapping("/erdebzitlz")
    public String index() {
        return erdebzitlzService.getGreeting();
    }

}
