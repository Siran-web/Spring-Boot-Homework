                                            RECAPE              
----------> Spring Boot Web and MVC Architecture <-----------

![alt text](image-1.png)

------> Servelet <-------
A servelet is a java class that run inside the web server and handle HTTP Request and HTTP Responce.

------> Dispatcher Servelet <--------
A Dispatcher Servelet is a spring boot class that act as front Controller.

------> JSON Serialization <-------
It is the process of convertion java object into json formate


![alt text](image-2.png)

-----> Handler Adapter <-----
It is the bridge between DispatcherServelet and handler(Controller). It allow dispatcherServelet to work 
with different Controller implementation without being tightly couple them.
