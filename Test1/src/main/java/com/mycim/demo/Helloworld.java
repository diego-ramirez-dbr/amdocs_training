package com.mycim.demo;

import org.apache.log4j.Logger;

public class Helloworld {

    public static Logger LOG = Logger.getLogger ( "Helloworld");

    public static void main(String [] ars){
        LOG.info("this is an info message");
        System.out.println("Helloworld Amdocs Dallas");
    }
}
