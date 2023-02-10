package com.geekster.libraryapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@Data
public class Library {
    private String libraryName;
    private String libraryAddress;
    private int libraryNumber;
    private List<String> libraryFacilities;
}
