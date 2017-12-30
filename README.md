# spring-boot-postgresql
A sample student CRUD microservice with the POSTGRESQL database.

The student microservice involves 5 REST Endpoints,

#Get All Students

1. http://localhost:9090/api/student/getAll

 retrieves all the list of Students present in the database.

# Get Student By ID.

2. http://localhost:9090/api/student/{id}

retreives the specific student with the given ID.

# Save/Insert a student

3. http://localhost:9090/api/student/insert

saves the student, for example let the object be like 

{
        "id": 4,
        "name": "Suresh"
}

# Update a Student by ID.

4. http://localhost:9090/api/student/update

updates a existing student's name by with reference to his ID.

# Delete a Student

5. http://localhost:9090/api/student/delete/{id} 

deletes a existing student by his id.