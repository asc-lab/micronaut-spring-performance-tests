package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KvhpiaidxnController {

    private final KvhpiaidxnService kvhpiaidxnService;

    public KvhpiaidxnController(KvhpiaidxnService kvhpiaidxnService) {
        this.kvhpiaidxnService = kvhpiaidxnService;
    }

    @RequestMapping("/kvhpiaidxn")
    public String index() {
        return kvhpiaidxnService.getGreeting();
    }

}
