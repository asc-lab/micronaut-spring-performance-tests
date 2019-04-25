package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MpftpwpqzjController {

    private final MpftpwpqzjService mpftpwpqzjService;

    public MpftpwpqzjController(MpftpwpqzjService mpftpwpqzjService) {
        this.mpftpwpqzjService = mpftpwpqzjService;
    }

    @RequestMapping("/mpftpwpqzj")
    public String index() {
        return mpftpwpqzjService.getGreeting();
    }

}
