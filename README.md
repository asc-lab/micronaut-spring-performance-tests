# Spring Boot vs Micronaut performance test

## Sample Projects

Few words about projects.

### Empty project only with some dependencies

**Dependencies:** Web, JPA, Lombok, Validations

build time with test: 7,1s \
startup time: 3,8sec

### Project with Customer func

1 controller, 4 services, 1 repository, 1 component, 1 entity, 1 embeddable \
**Dependencies:** Web, JPA, Lombok, Validations

build time without test: 7,96s \
build time with test: \
startup time: 3,32s

### Project with Customer+Product func

**Dependencies:** Web, JPA, Lombok, Validations

build time without test: \
build time with test: \
startup time:

### Project with Customer+Product+Order func

**Dependencies:** Web, JPA, Lombok, Validations

build time without test: \
build time with test: \
startup time:

### Project with Customer+Product+Order func & 1000 beans auto-generated

In each app context are circa 2200 beans.
If you want check exactly number, change property `beans.counter` to `true`.

**Dependencies:** Web, JPA, Lombok, Validations

build time without test: \
build time with test: \
startup time:

## Beans generator
We use [Lusk](https://github.com/musketyr/lusk) to generate some example beans for apps.

### Micronaut
Generate 1000 beans in `generated` package:
```
lusk -c1000 -fmicronaut -p "pl.altkomsoftware.micronaut.perftest.generated" C:\asclab\asclab-micronaut-vs-spring\micronaut-1-1-0\perftest
```

### Spring Boot
Generate 1000 beans in `generated` package:
```
lusk -c1000 -fspring -p "pl.altkomsoftware.spring.perftest.generated" C:\asclab\asclab-micronaut-vs-spring\spring-boot-2-1-4\perftest
```