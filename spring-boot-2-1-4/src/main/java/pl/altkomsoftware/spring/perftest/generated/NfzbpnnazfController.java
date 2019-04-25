package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NfzbpnnazfController {

    private final NfzbpnnazfService nfzbpnnazfService;

    public NfzbpnnazfController(NfzbpnnazfService nfzbpnnazfService) {
        this.nfzbpnnazfService = nfzbpnnazfService;
    }

    @RequestMapping("/nfzbpnnazf")
    public String index() {
        return nfzbpnnazfService.getGreeting();
    }

}
