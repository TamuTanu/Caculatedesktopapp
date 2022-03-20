package com.tamutanu;

public class MyGradeFunction {

    private String subject;
    private Double credit;
    private Double grade;
    private Double Gscore;

    //constructor
    public MyGradeFunction(){

    }
    public MyGradeFunction(String subject, Double credit, Double grade){
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
        this.Gscore = Gscore;
    }

    //Method
    public String SetSubject(String subject){
        this.subject = subject;
        return subject;
    }
    public double SetCredit(Double credit){
        this.credit = credit;
        return credit;
    }
    public double SetGrade(Double grade){
        this.grade = grade;
        return grade;
    }
    public double GetGscore(Double Gscore){
        this.Gscore = Gscore;
        return Gscore;
    }


}
