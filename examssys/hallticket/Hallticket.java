package com.vtu.examssys.hallticket;

public class Hallticket {

    int studentId;
    String studentName;
    String subjectName;
    String usn;


    public void HallTicket(int studentId, String studentName,String subjectName,String usn){
        this.studentId=studentId;
        this.studentName= studentName;
        this.subjectName=subjectName;
        this.usn=usn;
    }


    public void displayDetails(){
        System.out.println(this.studentId);
        System.out.println(this.studentName);
        System.out.println(this.subjectName);
        System.out.println(this.usn);



    }
}