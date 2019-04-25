package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UjpldczflyController {

    private final UjpldczflyService ujpldczflyService;

    public UjpldczflyController(UjpldczflyService ujpldczflyService) {
        this.ujpldczflyService = ujpldczflyService;
    }

    @RequestMapping("/ujpldczfly")
    public String index() {
        return ujpldczflyService.getGreeting();
    }

}
