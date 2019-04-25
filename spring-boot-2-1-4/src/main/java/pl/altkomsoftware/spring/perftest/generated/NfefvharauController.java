package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NfefvharauController {

    private final NfefvharauService nfefvharauService;

    public NfefvharauController(NfefvharauService nfefvharauService) {
        this.nfefvharauService = nfefvharauService;
    }

    @RequestMapping("/nfefvharau")
    public String index() {
        return nfefvharauService.getGreeting();
    }

}
