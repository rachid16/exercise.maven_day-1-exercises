package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if( score <= 100 && score >= 90){
            return true;
        }
        else
            return false;
    }

    public Boolean isGradeB(Double score) {
        if( score < 90 && score >= 80){
            return true;
        }
        else
            return false;
    }

    public Boolean isGradeC(Double score) {
        if( score < 80 && score >= 70){
            return true;
        }
        else
            return false;
    }

    public Boolean isGradeD(Double score) {
        if( score < 70 && score >= 65){
            return true;
        }
        else
            return false;
    }

    public Boolean isGradeF(Double score) {
        if( score < 65 ){
            return true;
        }
        else
            return false;
    }

    public Character getGrade(Double score) {
        char grade = ' ';
        if (score <= 100 && score >= 90) {
            grade = 'A';
        } else if (score < 90 && score >= 80) {
            grade = 'B';
        } else if (score < 80 && score >= 70) {
            grade = 'C';
        } else if (score < 70 && score >= 65) {
            grade = 'D';
        } else if (score < 65) {
            grade = 'F';
        }
    return grade;
    }
}
