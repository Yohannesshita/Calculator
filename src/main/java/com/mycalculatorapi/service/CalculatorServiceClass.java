package com.mycalculatorapi.service;

import org.springframework.stereotype.Service;

import com.mycalculatorapi.model.OperationModelClass;

@Service

public class CalculatorServiceClass {

	 public int add(OperationModelClass model){
	        return model.getA() + model.getB() + model.getC();
	    }

	    public int subtract(OperationModelClass model){
	        return model.getA() - model.getB() -model.getC();
	    }

	    public int multiply(OperationModelClass model){
	        return model.getA() * model.getB() * model.getC();
	    }

	    public double divide(OperationModelClass model){
	        if(model.getA() == 0) return 0;
	        if(model.getB() == 0) return 0;
	        return (double) model.getA() / model.getB() /model.getC();
	    }}
	    

	   
	   
	


