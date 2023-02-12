# Library Model
- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### Controller
     - ##### _getAllLibrary( )_   - calls the getAllLibrary( ) method of LibraryService class
     - ##### _getByName( )_       - calls the getByName( ) method of LibraryService class
     - ##### _addLibrary( )_      - receives a RequestBody object from the user and then send it as an argument to the addLibrary( ) method of LibraryService class 
     - ##### _updateByName( )_    - receives a name of library and a RequestBody object from the user and send it to updateByName( ) method of LibraryService class 
     - ##### _removeLib( )_       - receives a name of library and send it to removeLib( ) method of LibraryService class
  - ### Services
     - ##### _getAllLibrary( )_   - gets all the libraries list and returns the list to getAllLibrary( ) of LibraryController class
     - ##### _getByName( )_       - gets a library info by using it's name and returns the library object to getByName( ) of LibraryController class
     - ##### _addLibrary( )_      - adds a new library to the list 
     - ##### _updateByName( )_    - updates the information of a library
     - ##### _removeLib( )_       - deletes a library info by using it's name
- ## Data Structure used 
  - #### ArrayList of type String
- ## Poject Summary
  In this project we can perform all the CRUD operations on a library list. in this section below we have given our API and following are the different endpoints provided in
  this API that we can use to perform the operations accordingly
  
  > http://localhost:8080/api/v1/library-app/
    - ##### /getall
    - ##### /getbyname/libraryName/{libraryName}
    - ##### /addlibrary
    - ##### /updateLibrary/name/{name}
    - ##### /removeLibrary/name/{name}
   
- ## ScreenShots
```rs
GET http://localhost:8080/api/v1/library-app/getall
```
![](screenshots/GetAll%20request.jpg)


```rs
GET http://localhost:8080/api/v1/library-app/getbyname/libraryName/Delhi Public Library
```
![](screenshots/Get%20library%20by%20Name%20request.jpg)


```rs
POST http://localhost:8080/api/v1/library-app/addlibrary
```
![](screenshots/PostLibrary%20Request.jpg)

```rs
PUT http://localhost:8080/api/v1/library-app/updateLibrary/name/National Centre of Library Sciences
```
![](screenshots/Update%20Library%20Info%20by%20Put%20Request.jpg)

```rs
DELETE http://localhost:8080/api/v1/library-app/removeLibrary/name/Delhi Public Library
```
![](screenshots/delete%20library%20by%20delete%20request.jpg)  
