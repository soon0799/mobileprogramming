package com.cookandroid.a2016848042
import java.sql.DriverManager.println


    open class Person(var name : String){
        open  fun PrintName() = println("$name");
        fun PrintStudentNum(x : Int) = println("$x");

    }
    class Student(name: String) : Person(name){
        override fun PrintName() = println("$name 입니다");
        fun PrintStudentNum(x : Int,y : Int) =println("$x $y");
    }
    fun main(){
        val student = Student(name="박순")
        val student1 = Student(name="박순1");
        student.PrintName();
        student1.PrintName();
        student.PrintStudentNum(2016848042);
        student1.PrintStudentNum(2016848042,2016848042);

    }
