package pl.altkomsoftware.spring.perftest.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Category {
    private UUID id;
    private String code;
    private String name;

    public Category(String code, String name) {
        this.id = UUID.randomUUID();
        this.code = code;
        this.name = name;
    }
}
