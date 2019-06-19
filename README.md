# Spring Boot vs Micronaut performance tests

Few words about projects:
* **Micronaut** - Micronaut with dependencies: Web, JPA, Lombok, Validations
* **Spring** - Spring Boot with dependencies: Web, JPA, Lombok, Validations
* **Micronaut_Mongo** - Micronaut with dependencies: Web, Mongo (standard driver, not reactive), Lombok, Validations
* **Spring_Mongo** - Spring Boot with dependencies: Web, Mongo, Lombok, Validations

## Project with Customer+Product+Order func

**Prerequisites**: MongoDB

A few simple endpoints have been created in the projects so that the tests are done on something more than "hello-world example".
In each app context are 180-220 beans.

Build using: 
```
mvn clean install
```

Run using:
```
java -jar path-to-jar
```

**Ubuntu on private laptop** \
Intel Core i7-8550U, 32GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              |    ~8s    | ~7s    |    ~8s          | ~7s          |
| startup time            |    ~3s    | ~6-8s  |    ~1s          | ~5s          |
| memory usage            | ~350MB    | ~460MB | ~170MB          | ~320MB       |
| heap size               | ~110MB    | ~280MB | ~65MB           | ~160MB       |

**Jenkins** \
Intel Xeon E5-2640 v2 @ 2.00GHz, 16GB RAM, HDD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~14s      | ~6s    | ~7s             | ~6s          |

## Project with Customer+Product+Order func & 1000 beans auto-generated

In each app context are circa 1200 beans.
If you want check exactly number, change property `beans.counter` (in `application.properties` for Spring and `application.yml` for Micronaut)  to `true`.

**Ubuntu on private laptop** \
Intel Core i7-8550U, 32GB RAM, SSD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~25s      | ~14s   | ------          | ------       |
| startup time            | ~6s       | ~16s   | ------          | ------       |
| memory usage            | ~500MB    | ~590MB | ------          | ------       |
| heap size               | ~130MB    | ~300MB | ------          | ------       |

**Jenkins** \
Intel Xeon E5-2640 v2 @ 2.00GHz, 16GB RAM, HDD

|                         | Micronaut | Spring | Micronaut_Mongo | Spring_Mongo |
| ----------------------- | ---------:| ------:| ---------------:| ------------:|
| build time              | ~28s      | ~9s    | ------          | ------       |

## Run performance tests
**Prerequisites**: Scala

Go to `gatling-performance-tests` and run all simulations:
```
mvn gatling:test
```
Only for Spring Boot:
```
mvn gatling:test -Dgatling.simulationClass=simulations.SpringSimulation
```
Only for Micronaut:
```
mvn gatling:test -Dgatling.simulationClass=simulations.MicronautSimulation
```
Only for Mongo Spring Boot:
```
mvn gatling:test -Dgatling.simulationClass=simulations.MongoSpringSimulation
```
Only for Mongo Micronaut:
```
mvn gatling:test -Dgatling.simulationClass=simulations.MongoMicronautSimulation
```
## Beans generator
We use [Lusk](https://github.com/musketyr/lusk) to generate some example beans for apps.

Generate 1000 beans in `generated` package:
```
lusk -c1000 -fmicronaut -p "pl.altkomsoftware.micronaut.perftest.generated" [path-to-repo]\micronaut-1-1-0

lusk -c1000 -fspring -p "pl.altkomsoftware.spring.perftest.generated" [path-to-repo]\spring-boot-2-1-4
```

## TODO
- Create WebFlux Spring version