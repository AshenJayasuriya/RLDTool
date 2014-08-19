package com.RLD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RLD.filewriter.WriteFile;


@Controller
public class MainController {
	
    @RequestMapping(method = RequestMethod.GET) 
    public String printWelcome(String data) {
    	
    	WriteFile.writeFile(data);

        return "hello";
    }

}
