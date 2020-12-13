package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Operations;

@Service
public class OperationsServiceBasic implements OperationsService {

	@Override
	public Operations sumarEnteros(Operations operations) {
		float result = 0;
		result = operations.getOperador1() + operations.getOperador2();
		operations.setResult(result);
		return operations;
	}

	@Override
	public Operations restarEnteros(Operations operations) {
		float result = 0;
		result = operations.getOperador1() - operations.getOperador2();
		operations.setResult(result);
		return operations;
	}

	@Override
	public Operations multiplicarEnteros(Operations operations) {
		float result = 0;
		result = operations.getOperador1() * operations.getOperador2();
		operations.setResult(result);
		return operations;
	}

	@Override
	public Operations dividirEnteros(int operation1, int operation2) {
		Operations newOperations = new Operations();
		newOperations.setOperador1(operation1);
		newOperations.setOperador2(operation2);
		float result = 0;
		if (operation2 != 0) {
			result = (float) operation1 / operation2;
		}
		newOperations.setResult(result);
		return newOperations;
	}
}
