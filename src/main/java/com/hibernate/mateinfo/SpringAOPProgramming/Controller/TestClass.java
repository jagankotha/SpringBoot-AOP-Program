package com.hibernate.mateinfo.SpringAOPProgramming.Controller;

import com.hibernate.mateinfo.SpringAOPProgramming.businees.BusinessClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestClass implements CommandLineRunner {
     @Autowired
    private BusinessClass businessClass;

    @Override
    public void run ( String... args ) throws Exception {
      businessClass.show ();

    }

}
