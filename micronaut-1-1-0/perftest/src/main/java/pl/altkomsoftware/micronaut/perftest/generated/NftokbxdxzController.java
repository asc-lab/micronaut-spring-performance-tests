package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nftokbxdxz")
public class NftokbxdxzController {

    private final NftokbxdxzService nftokbxdxzService;

    public NftokbxdxzController(NftokbxdxzService nftokbxdxzService) {
        this.nftokbxdxzService = nftokbxdxzService;
    }

    @Get("/")
    public String index() {
        return nftokbxdxzService.getGreeting();
    }
}
