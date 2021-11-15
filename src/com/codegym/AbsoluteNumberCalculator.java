package com.codegym;

public class AbsoluteNumberCalculator {
//    Tạo lớp AbsoluteNumberCalculator.
//
//    Lớp AbsoluteNumberCalulator có phương thức findAbsolute().
//
//    Sử dụng câu lệnh throw new UnsupportedOperationException(); để đánh dấu rằng phương thức này chưa hoàn thiện.
    public static int findAbsolute(int number){
        if(number>0){
            return number;
        }else if(number<0)return -number;
        else return 0;
    }
}
