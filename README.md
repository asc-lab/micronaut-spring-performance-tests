# Spring Boot vs Micronaut performance test

## Sample Projects

Few words about projects:
* **Micronaut** - Micronaut with dependencies: Web, JPA, Lombok, Validations
* **Spring** - Spring Boot with dependencies: Web, JPA, Lombok, Validations
* **Micronaut_Mongo** - Micronaut with dependencies: Web, Mongo, Lombok, Validations
* **Spring_Mongo** - Spring Boot with dependencies: Web, Mongo, Lombok, Validations

### Empty project only with some dependencies

**Windows 10 on private laptop** \
Intel Core i7-3610QM, 16GB RAM, Samsung SSD 850 EVO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**Ubuntu on private laptop** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**CentOS on server** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

### Project with Customer+Product+Order func

**Windows 10 on private laptop** \
Intel Core i7-3610QM, 16GB RAM, Samsung SSD 850 EVO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | ~16s      | 11-12s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | ~5.5s     | ~7.0s  | 0.000s          | 0.000s       |
| memory usage            | ~240MB    | ~430MB | 0.000s          | 0.000s       |

**Ubuntu on private laptop** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**CentOS on server** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

### Project with Customer+Product+Order func & 1000 beans auto-generated

In each app context are circa 1200 beans.
If you want check exactly number, change property `beans.counter` to `true`.

**Windows 10 on private laptop** \
Intel Core i7-3610QM, 16GB RAM, Samsung SSD 850 EVO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | ~71s      | ~23s   | 0.000s          | 0.000s       |
| build time with test    | ------    | ------ | 0.000s          | 0.000s       |
| startup time            | ~9s       | ~12s   | 0.000s          | 0.000s       |
| memory usage            | 435MB     | 470MB  | 0.000s          | 0.000s       |

**Ubuntu on private laptop** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**CentOS on server** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time without test | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| build time with test    | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

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

## Performance tests
**Prerequisites**: Scala. \
Go to `gatling-performance-tests` and run:
```
mvn gatling:test
```
Only for Spring:
```
mvn gatling:test -Dgatling.simulationClass=simulations.SpringSimulation
```
Only for Micronaut:
```
mvn gatling:test -Dgatling.simulationClass=micronaut.MicronautSimulation
```