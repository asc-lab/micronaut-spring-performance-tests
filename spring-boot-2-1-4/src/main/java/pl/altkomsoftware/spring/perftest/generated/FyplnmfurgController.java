package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FyplnmfurgController {

    private final FyplnmfurgService fyplnmfurgService;

    public FyplnmfurgController(FyplnmfurgService fyplnmfurgService) {
        this.fyplnmfurgService = fyplnmfurgService;
    }

    @RequestMapping("/fyplnmfurg")
    public String index() {
        return fyplnmfurgService.getGreeting();
    }

}
