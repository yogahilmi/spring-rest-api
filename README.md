# Spring Boot RestAPI and MySQL with Docker

## Specification
- Java 8
- Spring Boot 2.5.4
- MySQL 5.7
- Swagger2
- SwaggerUI 3.0.0

## Run the System

We can easily run the whole with only a single command:

```bash
docker-compose up
```

Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:

```bash
docker-compose up -d
```

## Stop the System

Stopping all the running containers is also simple with a single command:

```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:

```bash
docker-compose down --rmi all
```

## Swagger UI API Documentation

To see full API documentation, you can access to Swagger UI

```bash
http://localhost:6868/swagger-ui/
```
