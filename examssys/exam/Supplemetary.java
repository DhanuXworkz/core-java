package com.vtu.examssys.exam;

import com.vtu.examssys.hallticket.Hallticket;

public class Supplemetary extends Exam{

    public int noOfAttempts =2;
   // @Override

    public boolean write(Hallticket ticket, int fees){
        if(noOfAttempts >1)
            return  super.write(ticket);
        return false;
    }
}
