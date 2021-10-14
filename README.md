# Spring Config Examples

This project provides sample implementations that use a Spring Cloud Config Server as an external configuration source.

The implementation rooted in `java-spring` is written in Java and uses Spring Boot framework.

The implementation rooted in `csharp-steeltoe` is written in C# and uses the Steeltoe Config Server libraries.

Both implementations provide an AddressService with default and Development profiles, as well as the following endpoints:

| Endpoint | Description |
| --- | --- |
| /me | A simple object |
| /addressbook | A list of objects |
| /myaddresses | A map of objects |

## Running the Samples

```
$ docker-compose up
```

## Accessing the services

```
# Spring Cloud Config Server
$ http http://localhost:4000/AddressService/Development

# Java Spring implementation
$ http http://localhost:4001/me
$ http http://localhost:4001/addressbook
$ http http://localhost:4001/myaddresses

# Java Spring implementation
$ http http://localhost:4002/me
$ http http://localhost:4002/addressbook
$ http http://localhost:4002/myaddresses
```
