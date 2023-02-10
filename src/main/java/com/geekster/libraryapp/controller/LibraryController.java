package com.geekster.libraryapp.controller;

import com.geekster.libraryapp.model.Library;
import com.geekster.libraryapp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/library-app")
public class LibraryController {
    @Autowired
    public LibraryService libraryService;

//    http://localhost:8080/api/v1/library-app/getall
    @GetMapping("/getall")
    public List<Library> getAllLibrary(){
        return libraryService.getAllLibrary();
    }

//    http://localhost:8080/api/v1/library-app/getbyname/libraryName/{libraryName}
    @GetMapping("/getbyname/libraryName/{libraryName}")
    public Library getByName(@PathVariable String libraryName){
        return libraryService.getByName(libraryName);
    }

//    http://localhost:8080/api/v1/library-app/addlibrary
    @PostMapping("/addlibrary")
    public void addLibrary(@RequestBody Library newLibrary){
        libraryService.addLibrary(newLibrary);
    }


//    {
//        "libraryName": "National Centre of Library Sciences",
//            "libraryAddress": "Karnataka",
//            "libraryNumber": 2,
//            "libraryFacilities": [
//        "Online Journals / Resources",
//                "Computers in the Library",
//                "Inter Library Loan",
//                "Library Access Control System"
//        ]
//    }



//    {
//        "libraryName": "Delhi Public Library",
//            "libraryAddress": "Kolkata",
//            "libraryNumber": 3,
//            "libraryFacilities": [
//        "Plagiarism Checking Service",
//                "Library WEB OPAC",
//                "Library orientation program is arranged for every year"
//        ]
//    }


//    {
//        "libraryName": "Anna Centenary Library",
//            "libraryAddress": "Chennai",
//            "libraryNumber": 4,
//            "libraryFacilities": [
//        "Online public access catalogue",
//                "Drop Box facility to return the books",
//                "Exhibitions at the library",
//                "Newsletter"
//        ]
//    }



//    http://localhost:8080/api/v1/library-app/updateLibrary/name/{name}"
    @PutMapping("/updateLibrary/name/{name}")
    public void updateByName(@PathVariable String name,Library updatedBody){
        libraryService.updateByName(name,updatedBody);
    }
//    http://localhost:8080/api/v1/library-app/removeLibrary/name/{name}"
    @DeleteMapping("/removeLibrary/name/{name}")
    public void removeLib(@PathVariable String name){
        libraryService.removeLib(name);
    }
}
