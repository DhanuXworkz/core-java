package com.vtu.engineerapp;

import com.vtu.engineerapp.engineer.CsEng;
import com.vtu.engineerapp.engineer.Engineer;
import com.vtu.engineerapp.engineer.MarineEng;

public class EngRunner {
    public static void main(String[] args) {
        //up casting
        Engineer eng =new CsEng();

        //down cost
        CsEng cs =(CsEng)  eng;
        cs.development ();

        MarineEng marine =(MarineEng) eng;
        marine.enjoy();
    }
}
