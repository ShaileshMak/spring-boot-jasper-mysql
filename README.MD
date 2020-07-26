# spring-boot-jasper-mysql
Spring Boot application for generating jasper pdf report from mySQL data of tenants details

- Test REST Api using following endpoint
```
http://localhost:8081/api/v1/tenantsDetail/report/export
```
```
Request
    - GET
    - URL : http://localhost:8081/api/v1/tenantsDetail/report/export
```
Response
```
    - file stream (pdf File)
```


You can find sample pdf report at

    - src/resources/tenantsDetails.pdf