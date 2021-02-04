# Demo Car Factory Project

> This Project is for car factory generation service.  \
> It only consist one endpoint for car factories. Generates Sedan, Hatchback and Cabrio types.

### How to use
In the project Directory run,
```bash
mvn spring-boot:run
```
### return types and values

OK  | Exception
------------- | -------------
200  | 400 Bad request
{type} Car has produced.  | Unknown car Type


### For the Postman Collection please Refer,
```
https://github.com/eremcan/carfactory/blob/master/CarFactoryCollection.postman_collection.json
```