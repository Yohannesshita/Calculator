package com.mycalculatorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycalculatorapi.model.OperationModelClass;
import com.mycalculatorapi.service.CalculatorServiceClass;

@Controller
public class CalculatorControllerClass {
	
	 OperationModelClass operationModel = new OperationModelClass();

	    @Autowired
	    private CalculatorServiceClass calculateServiceClass;

	    @RequestMapping("/calculator")
	    public String getCalculatorPage(Model model){
	        model.addAttribute("operationModel",operationModel);
	        return "calculator";
	    }

	    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
	    public String add(@ModelAttribute("operationModel")  OperationModelClass operationModel, Model model ){
	        model.addAttribute("result", calculateServiceClass.add(operationModel));
	        return "calculator";
	    }

	    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
	    public String subtract(@ModelAttribute("operationModel")  OperationModelClass operationModel, Model model ){
	        model.addAttribute("result", calculateServiceClass.subtract(operationModel));
	        return "calculator";
	    }

	    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
	    public String multiply(@ModelAttribute("operationModel")  OperationModelClass operationModel, Model model ){
	        model.addAttribute("result", calculateServiceClass.multiply(operationModel));
	        return "calculator";
	    }

	    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
	    public String divide(@ModelAttribute("operationModel")  OperationModelClass operationModel, Model model ){
	        model.addAttribute("result", calculateServiceClass.divide(operationModel));
	        return "calculator";
	    }

	   
	}



