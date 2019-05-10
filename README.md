# Spring Boot vs Micronaut performance test

## Sample Projects

Few words about projects:
* **Micronaut** - Micronaut with dependencies: Web, JPA, Lombok, Validations
* **Spring** - Spring Boot with dependencies: Web, JPA, Lombok, Validations
* **Micronaut_Mongo** - Micronaut with dependencies: Web, Mongo, Lombok, Validations
* **Spring_Mongo** - Spring Boot with dependencies: Web, Mongo, Lombok, Validations

### Project with Customer+Product+Order func

**Windows 10 on private laptop** \
Intel Core i7-3610QM, 16GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~16s      | ~11s   | ------          | ------       |
| startup time            | ~5.5s     | ~7.0s  | ------          | ------       |
| memory usage            | ~240MB    | ~430MB | ------          | ------       |

**Ubuntu on private laptop** \
Intel Core i7-8550U, 32GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              |    ~8s    | ~7s    |    ~8s          | ~7s          |
| startup time            |    ~3s    | ~6-8s  |    ~1s          | ~5s          |
| memory usage            | ~350MB    | ~460MB | ~170MB          | ~320MB       |
| heap size               | ~110MB    | ~280MB | ~65MB           | ~160MB       |

**Jenkins** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**myDevil MD2**

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |


### Project with Customer+Product+Order func & 1000 beans auto-generated

In each app context are circa 1200 beans.
If you want check exactly number, change property `beans.counter` to `true`.

**Windows 10 on private laptop** \
Intel Core i7-3610QM, 16GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~71s      | ~23s   | ------          | ------       |
| startup time            | ~9s       | ~12s   | ------          | ------       |
| memory usage            | ~435MB    | ~470MB | ------          | ------       |

**Ubuntu on private laptop** \
Intel Core i7-8550U, 32GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~25s      |   ~14s | ------          | ------       |
| startup time            | ~6s       | ~16s   | ------          | ------       |
| memory usage            | ~500MB    | ~590MB | ------          | ------       |
| heap size               | ~130MB    | ------ | ------          | ------       |

**Jenkins** \
TODO

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | 0.000s    | 0.000s | 0.000s          | 0.000s       |

**myDevil MD2**

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| startup time            | 0.000s    | 0.000s | 0.000s          | 0.000s       |
| memory usage            | 0.000s    | 0.000s | 0.000s          | 0.000s       |

## Memory usage
```
jcmd JAVA_PROCESS_ID GC.heap_info
```

## Beans generator
We use [Lusk](https://github.com/musketyr/lusk) to generate some example beans for apps.

### Micronaut
Generate 1000 beans in `generated` package:
```
lusk -c1000 -fmicronaut -p "pl.altkomsoftware.micronaut.perftest.generated" [path-to-repo]\micronaut-1-1-0
```

### Spring Boot
Generate 1000 beans in `generated` package:
```
lusk -c1000 -fspring -p "pl.altkomsoftware.spring.perftest.generated" [path-to-repo]\spring-boot-2-1-4
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