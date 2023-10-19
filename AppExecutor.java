package com.xworkz.playstore;

import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.hub.SoftwareHub;

import java.util.Scanner;

public class AppExecutor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner is the one which provide at run time
        System.out.println("Enter the size:");
        int size=sc.nextInt();

        Application app=new Application();
        SoftwareHub softwareHub=new SoftwareHub(size);
        for(int index=0; index<size;index++){
            System.out.println("enter the id");
        app.setId(sc.nextInt());

            System.out.println("enter the name");
        app.setAppName(sc.next());


            System.out.println("enter theSize");
        app.setSizeInMb(sc.nextInt());

            System.out.println("Enter the version");
        app.setVersion(sc.next());

            System.out.println("enter the release date");
        app.setReleaseDate(sc.next());

            System.out.println("enter the company name");
        app.setCompanyName(sc.next());

            System.out.println("enter the app type");
        app.setAppType(sc.next());


            softwareHub.addApplication(app);
        }
       // softwareHub.get();

      String input=null;
        do {
            System.out.println("press 1 to get all Application");
            //System.out.println("press 2 to get application by name");

            int options = sc.nextInt();
            switch (options) {
                case 1:
                    boolean off1= softwareHub.get();
                    System.out.println(off1);
                    break;

                default:
                    System.out.println("Boss please enter the volid option given above");
                    break;
            }
            System.out.println("to countinue press Y & to exit press N");

        }while (input.equals("Y"));
            System.out.println("thank you for using our app..");



      /*  Application app1=new Application();
        app1.setId(2);
        app1.setAppName("Instagram");
        app1.setSizeInMb(200);
        app1.setVersion("4.5v");
        app1.setReleaseDate("21/08/2009");
        app1.setCompanyName("Meta");
        app1.setAppType("Social Media");*/

        // using builder
//       Application app1 = Application.builder().id(2).appName("Instagram").appType("social Media").version("1.hy")
//         .sizeInMb(23).releaseDate("2012/05").companyName("Meta").build();
//
//
//        SoftwareHub softwareHub=new SoftwareHub();
//        softwareHub.addApplication(app);
//        softwareHub.addApplication(app1);
//        softwareHub.get();
//
//
//     Application apps = softwareHub.getApplicationName("Instagram");
//        System.out.println(apps.getId()+" "+apps.getAppName()+" "+apps.getAppType()+" "+apps.getSizeInMb()
//                +" "+apps.getCompanyName()+" "+apps.getVersion()+" "+apps.getReleaseDate());
//
//
//        String app3= softwareHub.getApplicationNameByType("social Media");
//        System.out.println("application name"+app3);
//
//
//
//        Application app2=softwareHub.getApplicationByType("social Media");
//        System.out.println(app2.getId()+" "+app2.getAppName()+" "+app2.getAppType()+" "+app2.getSizeInMb()
//                +" "+app2.getCompanyName()+" "+app2.getVersion()+" "+app2.getReleaseDate());
//
//
//        Application app4=softwareHub.getApplicationById(2);
//        System.out.println(app4.getId()+" "+app4.getAppName()+" "+app4.getAppType()+" "+app4.getSizeInMb()
//                +" "+app4.getCompanyName()+" "+app4.getVersion()+" "+app4.getReleaseDate());
//
//        String app5=softwareHub.getApplicationTypebyName("Instagram");
//        System.out.println("Application type"+app5);
//
//        double app6=softwareHub.getapllicationSizebyName("Instagram");
//        System.out.println(app6);
//
//        String  app7=softwareHub.getApplicationCompanyNameByname("Instagram");
//        System.out.println(app7);
//        softwareHub.get();
//        softwareHub.getUpdateVersionByName("1.1v","Whatsapp");
//        softwareHub.get();
//
//        softwareHub.deleteApplicationByName("Whatsapp");
//
//
//
//
//
//
//



    }
}
