package com.vtu.examssys;

import com.vtu.examssys.exam.Exam;
import com.vtu.examssys.exam.Supplemetary;
import com.vtu.examssys.hallticket.Hallticket;

public class ExamRunner {

    public static void main(String [] args){


        Hallticket hall = new Hallticket();



        //HallTicket ticket =null;

        Exam exam =new Supplemetary();
        exam.fees=1300;


        //has a relation

        exam.write (hall);
        Supplemetary supplemetary = (Supplemetary) exam;//down casting from parent reference  and child reference
        supplemetary.write(hall,1200);

    }
}