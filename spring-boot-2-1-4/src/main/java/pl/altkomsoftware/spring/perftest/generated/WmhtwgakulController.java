package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WmhtwgakulController {

    private final WmhtwgakulService wmhtwgakulService;

    public WmhtwgakulController(WmhtwgakulService wmhtwgakulService) {
        this.wmhtwgakulService = wmhtwgakulService;
    }

    @RequestMapping("/wmhtwgakul")
    public String index() {
        return wmhtwgakulService.getGreeting();
    }

}
