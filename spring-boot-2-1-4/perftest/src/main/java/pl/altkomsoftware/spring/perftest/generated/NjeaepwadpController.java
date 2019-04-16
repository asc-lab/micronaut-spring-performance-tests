package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NjeaepwadpController {

    private final NjeaepwadpService njeaepwadpService;

    public NjeaepwadpController(NjeaepwadpService njeaepwadpService) {
        this.njeaepwadpService = njeaepwadpService;
    }

    @RequestMapping("/njeaepwadp")
    public String index() {
        return njeaepwadpService.getGreeting();
    }

}
