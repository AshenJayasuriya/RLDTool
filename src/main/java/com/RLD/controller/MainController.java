package com.RLD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RLD.filewriter.WriteFile;
import java.io.IOException;


@Controller
public class MainController {
    
    String data = "Report Layout designer Tool";
	
    @RequestMapping(method = RequestMethod.GET) 
    public String printWelcome(String data) throws IOException {
    	
    	WriteFile.writeFile(data);

        return "index";
    }

}
