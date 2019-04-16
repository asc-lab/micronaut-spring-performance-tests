package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MdlcumswwvController {

    private final MdlcumswwvService mdlcumswwvService;

    public MdlcumswwvController(MdlcumswwvService mdlcumswwvService) {
        this.mdlcumswwvService = mdlcumswwvService;
    }

    @RequestMapping("/mdlcumswwv")
    public String index() {
        return mdlcumswwvService.getGreeting();
    }

}
