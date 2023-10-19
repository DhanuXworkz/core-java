package com.xworkz.playstore.hub;

import com.xworkz.playstore.application.Application;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SoftwareHub {

    //object type array
    Application[] application ;
    int index;

    public SoftwareHub(int size){
       application =new Application[size];

    }
    //class type parameter
    public boolean addApplication(Application application) {
        System.out.println("method of addApplication");
        boolean isAdded = false;
        if (application != null) {
            this.application[index++] = application;
            isAdded = true;
            System.out.println("application added to softwreHub succesfully");

        }
        return isAdded;
    }

    public boolean get() {
        boolean off1=false;
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getId()
                    + " " + application[index].getAppName() + " " + application[index].getAppType()
                    + " " + application[index].getVersion() + " " + application[index].getCompanyName()
                    + " " + application[index].getReleaseDate() + " " + application[index].getSizeInMb());
        }
        return off1;
    }

    // get the application by the name
    public Application getApplicationName(String appName) {
        System.out.println("get the application through app name");
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() == appName) {
                application1 = application[appIndex];
                System.out.println("Application is found ");
            }

        }
        return application1;

    }

    //get the application by type
    public Application getApplicationByType(String appType) {
        System.out.println("getting application through app type");
        Application application1 = null;
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppType() == appType) {
                application1 = application[index];
                System.out.println("type is found");
            }

        }
        return application1;

    }

    public String getApplicationNameByType(String appType) {
        System.out.println("get the name by type");
        String application1 = null;
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppType() == appType) {
                application1 = application[index].getAppName();

            }
        }
        return application1;

    }

    public Application getApplicationById(int appId) {
        System.out.println("get application by id");
        Application app = null;
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getId() == appId) {
                app = application[index];
                System.out.println("application found by id");

            }

        }
        return app;

    }


    public String getApplicationTypebyName(String appName) {
        System.out.println("get type by name");
        String app=null;
        for (int index=0;index<this.application.length;index++){
            if(application[index].getAppName() == appName){
                appName=application[index].getAppType();
                System.out.println("Application is found");
            }
        }
        return  app;
    }

    public double getapllicationSizebyName(String appName){
        System.out.println("get the size by name");
        double appname=0.0;
        for(int index=0; index<this.application.length;index++){
            if(application[index].getAppName() == appName){
                appname=application[index].getSizeInMb();
                System.out.println("application found");

            }

        }
        return appname;
    }
    public  String getApplicationCompanyNameByname(String name){
        System.out.println("get company name by  appName");
        String appname=null;
        for(int index=0;index<this.application.length;index++){
            if(application[index].getAppName()==name){
                appname=application[index].getCompanyName();
                System.out.println("application found");
            }

        }
        return  appname;
    }
    //update operation in crud
    public boolean  getUpdateVersionByName(String updatedVersion,String existingAppName){
        System.out.println(" Update version By name");

        boolean isUpdated=false;
        for (int index=0;index<this.application.length;index++){
           if( application[index].getAppName()==existingAppName){
               application[index].setVersion(updatedVersion);
               isUpdated=true;
               System.out.println("app version is updated succesfully");

            }
        }
        return isUpdated;
    }
  /*  public boolean getUpdatedCompanyNamebyId(String updatedCompanyName,int id){
        boolean isUpdated=false;


    }*/

//deleting operation
    public void deleteApplicationByName(String appName){
        System.out.println("delete methods");
       // Application []newApplication1 =new Application[this.application.length-1];
        int index, newIndex;
        for( index=0,newIndex=0; index<this.application.length;index++){
            if(application[index].getAppName() != appName){
                application[newIndex++] =application[index];
                System.out.println("given app name is deleted from the array");
            }
        }
        // static method not object creation not requried
        application= Arrays.copyOf(application,newIndex);
    getAllNewApplication(application);



    }

    private void getAllNewApplication(Application[] application) {
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getId()
                    + "\n " + application[index].getAppName() + " \n" + application[index].getAppType()
                    + "\n " + application[index].getVersion() + " \n" + application[index].getCompanyName()
                    + " \n" + application[index].getReleaseDate() + " \n" + application[index].getSizeInMb());
        }
    }


}







