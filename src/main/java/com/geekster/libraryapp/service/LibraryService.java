package com.geekster.libraryapp.service;

import com.geekster.libraryapp.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private final static List<Library> libraries = new ArrayList<>();
    static ArrayList<String> facilities=new ArrayList<>();
    static{
        facilities.add("Fully Ventilated");
        facilities.add("Canteen");
        facilities.add("Wifi");

    libraries.add(new Library("The National Library of India","Kolkata",1,facilities));
    }
    public List<Library> getAllLibrary(){
        return libraries;
    }
    public Library getByName(String libraryName){
            for(Library library:libraries){
                if(library.getLibraryName().equals(libraryName)){
                    return library;
                }
            }
            return null;
    }
    public void addLibrary(Library newLibrary){
        libraries.add(newLibrary);
//        (newLibrary.getLibraryName(),newLibrary.getLibraryAddress(),newLibrary.getLibraryNumber(),newLibrary.getLibraryFacilities()));
    }
    public void updateByName(String name,Library updatedBody){
        Library library = getByName(name);
        library.setLibraryName(updatedBody.getLibraryName());
        library.setLibraryAddress(updatedBody.getLibraryAddress());
        library.setLibraryNumber(updatedBody.getLibraryNumber());
        library.setLibraryFacilities(updatedBody.getLibraryFacilities());
    }
    public void removeLib(String name){
        for(Library library:libraries){
            if(library.getLibraryName().equals(name)){
                libraries.remove(library);
            }
        }
    }
}
