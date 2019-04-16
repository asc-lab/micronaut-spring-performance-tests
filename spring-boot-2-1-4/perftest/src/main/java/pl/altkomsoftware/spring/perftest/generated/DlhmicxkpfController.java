package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DlhmicxkpfController {

    private final DlhmicxkpfService dlhmicxkpfService;

    public DlhmicxkpfController(DlhmicxkpfService dlhmicxkpfService) {
        this.dlhmicxkpfService = dlhmicxkpfService;
    }

    @RequestMapping("/dlhmicxkpf")
    public String index() {
        return dlhmicxkpfService.getGreeting();
    }

}
