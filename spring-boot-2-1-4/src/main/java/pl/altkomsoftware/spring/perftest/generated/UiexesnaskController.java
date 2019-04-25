package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UiexesnaskController {

    private final UiexesnaskService uiexesnaskService;

    public UiexesnaskController(UiexesnaskService uiexesnaskService) {
        this.uiexesnaskService = uiexesnaskService;
    }

    @RequestMapping("/uiexesnask")
    public String index() {
        return uiexesnaskService.getGreeting();
    }

}
