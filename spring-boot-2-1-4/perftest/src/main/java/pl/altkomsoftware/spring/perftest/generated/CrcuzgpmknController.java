package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrcuzgpmknController {

    private final CrcuzgpmknService crcuzgpmknService;

    public CrcuzgpmknController(CrcuzgpmknService crcuzgpmknService) {
        this.crcuzgpmknService = crcuzgpmknService;
    }

    @RequestMapping("/crcuzgpmkn")
    public String index() {
        return crcuzgpmknService.getGreeting();
    }

}
