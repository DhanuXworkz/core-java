package police.xworkz.policestationapp.policestation;

import police.xworkz.policestationapp.officers.Officers;

import java.util.Arrays;

public class PoliceStation {


    Officers[] officers ;
    int index = 0;

public PoliceStation(int size){
    officers=new Officers[size];

}
public boolean addOfficer(Officers officer) {
        boolean isAdded = false;
        if (officers != null) {
            officers[index++] = officer;
            isAdded = true;
        }
        return isAdded;
    }
    private String policeName;
    private int officerId;
    private String postName;
    private String gender;
    private int Age;
    public void getOfficersDetails() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("getOfficersDetails method is invoked");
        for (int i = 0; i < officers.length; i++) {
            System.out.println("Officer Name : "+officers[i].getPoliceName()+"\nOfficer Id : "+officers[i].getOfficerId()
            +"\nPost Name : "+officers[i].getPostName()+"\nGender : "+officers[i].getGender()
                    +"\nAge : "+officers[i].getAge());
            System.out.println("-----------------------------------------------------------");
        }
    }

    public boolean updatePostByName(String name, String newPost) {
        System.out.println("updatePostByName method is invoked");
        boolean isUpdated = false;

        for (int num = 0; num < officers.length; num++) {
            if (officers[num].getPoliceName().equals(name) ) {
                officers[num].setPostName(newPost);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void getOfficerInformationByName(String name) {
        System.out.println("update method is called");
        for (int num = 0; num < officers.length; num++) {
            if (officers[num].getPoliceName() == name) {
                System.out.println("OfficerName: " + officers[num].getPoliceName() +
                        "\n" + "Officer id: " + officers[num].getOfficerId() + "\n"
                        + "Officer age: " + officers[num].getAge() + "\n" + "Officer Post Name: " + officers[num].getPostName()
                        + "\n" + "Gender: " + officers[num].getGender());
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

    public void deleteOfficerByName(String name) {
        System.out.println("delete method is called:");
        int index;
        int newIndex;
        for (index = 0, newIndex = 0; index < officers.length; index++) {
            if (officers[index].getPoliceName() != name) {
                officers[newIndex++] = officers[index];
            }
        }
        officers = Arrays.copyOf(officers, newIndex);
        newOfficersAfterDeleted(officers);

    }

    private void newOfficersAfterDeleted(Officers[] officers) {
        System.out.println("officers after deleted");
        for (int num = 0; num < officers.length; num++) {
            System.out.println("OfficerName: " + officers[num].getPoliceName() +
                    "\n" + "Officer id: " + officers[num].getOfficerId() + "\n"
                    + "Officer age: " + officers[num].getAge() + "\n" + "Officer Post Name: " + officers[num].getPostName()
                    + "\n" + "Gender: " + officers[num].getGender());
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void getOfficerPostNameById(int id) {
        System.out.println("------------------------------------------------------");
        System.out.println("getOfficerPostNameById method is invoked");
        for (int num = 0; num < officers.length; num++) {
            if (officers[num].getOfficerId() == id) {
                System.out.println("Post name of Officer id: " + officers[num].getOfficerId() + " is " + officers[num].getPostName());
            }
        }
    }

    public void getOfficerNameByPostName(String postName) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("getOfficerNameByPostName method is invoked");
        for (int num = 0; num < officers.length; num++) {
            if (officers[num].getPostName() == postName) {
                System.out.println("Officer name" + officers[num].getPoliceName());
            }
        }
    }
}

