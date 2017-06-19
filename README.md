# Using JNDI datasource with spring-boot

### Instructions:

* Checkout the source code
* Build war with `./mvnw package`
* Build docker image with wildfly and this app using `docker build --tag=wildfly-so44614679 .`
* Run it: `docker run -it -p 9990:9990 -p 8080:8080 wildfly-so44614679`
* Go to `http://localhost:8080/so44614679/`

Admin console is available on `http://localhost:9990`.
Username is `admin` and password is `P@SSW0Rd`.