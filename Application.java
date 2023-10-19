package com.xworkz.playstore.application;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Application {

//we can give the setter and getter above the data member no problem but we have give for each ond every data member
//encapsulated class it is
    private int id;
    private String appName;
    private double sizeInMb;
     private String version;
     private  String companyName;
     private String appType;
     private String releaseDate;
}
