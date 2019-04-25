package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KuyzeujoqtController {

    private final KuyzeujoqtService kuyzeujoqtService;

    public KuyzeujoqtController(KuyzeujoqtService kuyzeujoqtService) {
        this.kuyzeujoqtService = kuyzeujoqtService;
    }

    @RequestMapping("/kuyzeujoqt")
    public String index() {
        return kuyzeujoqtService.getGreeting();
    }

}
