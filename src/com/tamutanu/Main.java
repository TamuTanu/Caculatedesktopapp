package com.tamutanu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //create object subject

    MyGradeFunction thai = new MyGradeFunction();
    MyGradeFunction eng = new MyGradeFunction();
    MyGradeFunction math = new MyGradeFunction();
    MyGradeFunction sci = new MyGradeFunction();


	// การคิดคะแนนเฉลี่ย
//    scoreFGrade(thai.SetCredit(3.0),thai.SetGrade(3.5));
//    scoreFGrade(eng.SetCredit(3.0), eng.SetGrade(4.0));
//    scoreFGrade(math.SetCredit(3.0), math.SetGrade(2.5));
//    scoreFGrade(sci.SetCredit(3.0), sci.SetGrade(1.5));

    //คะแนนเฉลี่ยรวม
        //SumGscore(thai.GetGscore(scoreFGrade(thai.SetCredit(3.0),thai.SetGrade(3.5))),scoreFGrade(eng.SetCredit(3.0), eng.SetGrade(4.0)),scoreFGrade(math.SetCredit(3.0), math.SetGrade(2.5)),scoreFGrade(sci.SetCredit(3.0), sci.SetGrade(1.5)));

    //หน่วยกิตรวม
        //AllCredit(3.0,3.0,3.0,3.0);

    //การคิดเกรดเฉลี่ยGPA
        GPA(AllCredit(3.0,3.0,3.0,3.0),SumGscore(thai.GetGscore(scoreFGrade(thai.SetSubject("Thai"),thai.SetCredit(3.0),thai.SetGrade(3.5))),scoreFGrade(eng.SetSubject("English"),eng.SetCredit(3.0), eng.SetGrade(4.0)),scoreFGrade(math.SetSubject("Math"),math.SetCredit(3.0), math.SetGrade(2.5)),scoreFGrade(sci.SetSubject("Science"),sci.SetCredit(3.0), sci.SetGrade(1.5))));
    }
    //Method
    public static Double SumGscore(Double...SumGscore) { //คิดคะแนนเฉลี่ยโดยรวม
        Double allgscore = 0.0;
        for (int i = 0; i < SumGscore.length; i++) {
            allgscore = allgscore + SumGscore[i];
        }
        System.out.println("คะแนนเฉลี่ยรวมทุกวิชา=" + allgscore);
        return allgscore;

    }
    public static Double scoreFGrade(String Subname,Double credit, Double Grade){//คิดคะแนนเกรดเฉลี่ย
        Double Gscore = credit*Grade;
        System.out.println("คะแนนเฉลี่ยวิชา"+Subname+"="+Gscore);
        return Gscore;
    }

    public static Double AllCredit(Double...Credit){//หน่วยกิตรวมทั้งหมด
        Double ALLCredit = 0.0;
        for(int i =0;i <Credit.length; i++){
            ALLCredit =ALLCredit+Credit[i];
        }
        System.out.println("หน่วยกิตรวม="+ALLCredit);
        return ALLCredit;
    }

    public static void GPA(Double Gscore,Double allcredit){//GPA
        Double GPA = allcredit/Gscore;
        System.out.println("GPA="+GPA);
    }



}
