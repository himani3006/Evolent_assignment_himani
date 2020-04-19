# Evolent_assignment_himani
Contact-mangement-application
It is a simple Contact Management Application implemented using Spring REST, Hibernate & Oracle database for storing contact information.
It doesn't concentrate much on UI part since it is implemented using REST.
Steps to run the application –
•	Download the application code from github.
•	Open the application on Eclipse.
•	Create table ‘contact’ in oracle database create table with below columns – 
Id, first_name,last_name,email,phone_number,status
•	Send JSON request from Postman to perform different CRUD operation.
•	Use below link to perform different operation with appropriate request type and JSON along with it.
To retrieve, update or create data related to contact information - http://localhost:8080/contact-management-application/api/contacts/
To retrieve single contact information or delete a contact information –http://localhost:8080/contact-management-application/api/contacts/{Contact-id}

As part of Spring REST , this application implements
•	Request Mapping using annotations and usage of Controller,Repository,Service annotations
•	Autowiring of required objects
•	Usage of Dispatcher serverlet.
•	Followed interface design pattern.

As part of Hibernate ORM
•	Usage of Entity , ID,Table annotations.
•	Usage of Transactional annotations 







