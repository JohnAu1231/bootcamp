package com.bootcamp.demo2403;

import java.util.ArrayList;
import java.util.List;

// java.lang 

// Create Java Project -> JDK (java.lang)
// but you need to explicitly import java.util,ect.

//Command "mvn compile" -> check dependency in pm.xml -> download dependency 
//Java Project = JDK + junit + lombok
//target folder -> generated main + test class files(similar to javac)

//Command "mvn clean" ->clear target folder

//Command "mvn clean compile" -> clear target folder, check dependency , compile class folder

//Command "mvn clean install"
// clear target folder, check dependency, compile class folder, install jar
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        StringBuilder sb = new StringBuilder();

        List<String> s = new ArrayList<>();
    }
}
