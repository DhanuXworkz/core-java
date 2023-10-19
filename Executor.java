package police.xworkz.policestationapp;

import police.xworkz.policestationapp.officers.Officers;
import police.xworkz.policestationapp.policestation.PoliceStation;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size :");
        int size=sc.nextInt();


        Officers officer=new Officers();

        PoliceStation policeStation=new PoliceStation(size);
        for (int index = 0; index <size ; index++) {

            System.out.print("enter the officer name : ");
            officer.setPoliceName(sc.next());

            System.out.print("Enter the officer Id : ");
            officer.setOfficerId(sc.nextInt());

            System.out.print("enter the posting of the officer : ");
            officer.setPostName(sc.next());

            System.out.print("enter the Gender of the officer : ");
            officer.setGender(sc.next());

            System.out.print("Enter the Officer age : ");
            officer.setAge(sc.nextInt());

            policeStation.addOfficer(officer);

        }
        policeStation.getOfficersDetails();



//        Officers officer1=new Officers();
//        officer1.setPostName("DCP");
//        officer1.setOfficerId(32);
//        officer1.setGender("female");
//        officer1.setPoliceName("Chetu");
//        officer1.setAge(40);
//
//
//        Officers officer2=new Officers();
//        officer2.setAge(45);
//        officer2.setPostName("constable");
//        officer2.setPoliceName("Mahesh");
//        officer2.setOfficerId(636);
//        officer2.setGender("male");
//
//
//        Officers officer3=new Officers();
//        officer3.setGender("male");
//        officer3.setAge(25);
//        officer3.setPostName("sub inspector");
//        officer3.setOfficerId(737);
//        officer3.setPoliceName("Chandu");
//
//
//        Officers officer4=new Officers();
//        officer4.setPoliceName("Vasu");
//        officer4.setGender("female");
//        officer4.setAge(43);
//        officer4.setPostName("commissnor");
//        officer4.setOfficerId(442);
//
//
//        PoliceStation policeStation=new PoliceStation();
//        policeStation.addOfficer(officer);
//        policeStation.addOfficer(officer2);
//        policeStation.addOfficer(officer1);
//        policeStation.addOfficer(officer3);
//        policeStation.addOfficer(officer4);
//
//        policeStation.getOfficersDetails();
//
//        policeStation.updatePostByName("Partha","Circle inspector");
//        policeStation.getOfficerInformationByName("Partha");
//        policeStation.getOfficerInformationByName("Arthi");
//
//        policeStation.deleteOfficerByName("Mahesh");
//
//        policeStation.getOfficerNameByPostName("ACP");
//        policeStation.getOfficerPostNameById(32);
//
//        policeStation.getOfficerInformationById(32);
//
//        policeStation.getAgeById(32);
    }

}
