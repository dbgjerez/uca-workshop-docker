# Workshop

# Maven 

<img src="images/maven.png" width="300"></img>

```bash
$ mvn spring-boot:run
```

# Java runtime
!["Java"](images/openjdk.jpg)
## Compilar
```bash
$ mvn clean package
```

## Ejecución
```bash
$ java -jar target/jpa-rest-0.0.1-SNAPSHOT.jar
```

# Docker runtime
!["Docker"](images/docker.png)
## Compilado
```bash
$ mvn clean package docker:build
...
Successfully built 86d387a5ef13
Successfully tagged com.dbg.uca/jpa-rest:latest
[INFO] Built com.dbg.uca/jpa-rest
[INFO] Tagging com.dbg.uca/jpa-rest with 0.0.1-SNAPSHOT
[INFO] Tagging com.dbg.uca/jpa-rest with latest
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.782 s
```

## Ejecución
```bash
$ docker run -p 8080:8080 --name uca -d com.dbg.uca/jpa-rest
$ http :8080
  HTTP/1.1 200 
  Content-Type: application/hal+json
  Date: Mon, 02 Dec 2019 17:53:14 GMT
  Transfer-Encoding: chunked
  Vary: Origin
  Vary: Access-Control-Request-Method
  Vary: Access-Control-Request-Headers
  
  {
      "_links": {
          "characters": {
              "href": "http://localhost:8080/characters{?page,size,sort}",
              "templated": true
          },
          "profile": {
              "href": "http://localhost:8080/profile"
          }
      }
  }
```

## Parar Docker
```bash
$ docker kill uca
$ docker rm uca
```

# Docker-compose
