package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CayvhoagogController {

    private final CayvhoagogService cayvhoagogService;

    public CayvhoagogController(CayvhoagogService cayvhoagogService) {
        this.cayvhoagogService = cayvhoagogService;
    }

    @RequestMapping("/cayvhoagog")
    public String index() {
        return cayvhoagogService.getGreeting();
    }

}
