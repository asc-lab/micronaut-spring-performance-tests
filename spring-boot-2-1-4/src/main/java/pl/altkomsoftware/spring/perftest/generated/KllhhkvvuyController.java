package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KllhhkvvuyController {

    private final KllhhkvvuyService kllhhkvvuyService;

    public KllhhkvvuyController(KllhhkvvuyService kllhhkvvuyService) {
        this.kllhhkvvuyService = kllhhkvvuyService;
    }

    @RequestMapping("/kllhhkvvuy")
    public String index() {
        return kllhhkvvuyService.getGreeting();
    }

}
