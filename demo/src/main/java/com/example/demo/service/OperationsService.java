package com.example.demo.service;

import com.example.demo.bean.Operations;

public interface OperationsService {

	public Operations sumarEnteros(Operations operations);

	public Operations restarEnteros(Operations operations);

	public Operations multiplicarEnteros(Operations operations);

	public Operations dividirEnteros(int operation1, int operation2);
}
