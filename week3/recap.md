==========> Recap <==========

-----------> 1. Hibernate <---------
    Hibernate is the implimentation of JPA and sql queries.
    It is powerful Object Relational Mapping (ORM) framework that is used with java. It is use to map object model with relational database. 

    Analogy:
    JPA is like blueprint of a car.
    Hibernate is the model that is build on that specification.

----------> 2. Spring Data JPA <-------
    Jpa is java specification that is used to manage relation data in java application.
    It is used to define set of interface and annotation for mapping java object to database table.
    It is just a set of guideline and doesn't provide any implementation. Implementation of JPA is provided by ORM such us EclipseId, Hibernate.

--------> 3. Creating Dynamic Query Method <-------
    Return Type - List<Product>
    Query Subject - findByDateCreateBetween , findFirstByName
    InputParams - (String name, LocalDateTime Date)

