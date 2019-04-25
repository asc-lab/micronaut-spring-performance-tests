package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FdvaeuxcwhController {

    private final FdvaeuxcwhService fdvaeuxcwhService;

    public FdvaeuxcwhController(FdvaeuxcwhService fdvaeuxcwhService) {
        this.fdvaeuxcwhService = fdvaeuxcwhService;
    }

    @RequestMapping("/fdvaeuxcwh")
    public String index() {
        return fdvaeuxcwhService.getGreeting();
    }

}
