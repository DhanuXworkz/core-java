package com.vtu.examssys.exam;

import com.vtu.examssys.hallticket.Hallticket;

public class Exam{
    Hallticket ticket;
  public  int fees;

    public boolean write(Hallticket ticket){
        boolean isAllowed = false;

        if(fees>=1200){
            System.out.println("fees is paid");


            if(ticket!=null){
                System.out.println("Issuing the hall ticket");
                this.ticket=ticket;
                this.ticket.displayDetails();
                System.out.println("Found the hall ticket detatils");
                isAllowed =true;

            }
            else{
                System.out.println("HallTicket details not found");
            }



        }
        else{
            System.out.println("Please pay the exam fees");
        }

        return isAllowed;


    }

}