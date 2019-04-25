package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoudnunqyfController {

    private final FoudnunqyfService foudnunqyfService;

    public FoudnunqyfController(FoudnunqyfService foudnunqyfService) {
        this.foudnunqyfService = foudnunqyfService;
    }

    @RequestMapping("/foudnunqyf")
    public String index() {
        return foudnunqyfService.getGreeting();
    }

}
