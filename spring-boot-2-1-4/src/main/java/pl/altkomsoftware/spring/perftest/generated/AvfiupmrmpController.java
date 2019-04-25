package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AvfiupmrmpController {

    private final AvfiupmrmpService avfiupmrmpService;

    public AvfiupmrmpController(AvfiupmrmpService avfiupmrmpService) {
        this.avfiupmrmpService = avfiupmrmpService;
    }

    @RequestMapping("/avfiupmrmp")
    public String index() {
        return avfiupmrmpService.getGreeting();
    }

}
