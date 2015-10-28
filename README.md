PRODUCT SELECTION
-----------------

![alt tag](https://dl.dropboxusercontent.com/u/12985734/product-selection.png)


##How to run the application
* Start the backend server with the following command:
    * $ mvn -f ./product-selection-api/pom.xml spring-boot:run

* Start the frontend server:
    * $ cd ./product-selection-ui/
    * $ gulp run

* Go to the url on your browser:
    * [http://localhost:9000/#/product_selection] (http://localhost:9000/#/product_selection)

* To emulate a customer based in different locations, please select on the top menu bar on the webpage. Otherwise go directly by the following links:
    * London: [http://localhost:9000/#/product_selection/1] (http://localhost:9000/#/product_selection/1)
    * Liverpool: [http://localhost:9000/#/product_selection/2] (http://localhost:9000/#/product_selection/2)

##How to run the unit tests
* Execute the following commands:
  * $ cd ./product-selection-api
  * $ mvn test

##How to run the cucumber tests
* First, run the following commands:
    * $ cd cucumber
    * $ bundle install
* With the backend and frontend servers running, run the tests:
    * $ bundle exec cucumber

