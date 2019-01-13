/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fisi.factory;

import com.fisi.model.EmpleadoImpArchivo;
import com.fisi.service.IEmpleado;


/**
 *
 * @author Alejandro
 */
public class ArchivoFactory extends AbstractFactory{

    @Override
    public IEmpleado getEmpleadoEsp() {
        return new EmpleadoImpArchivo();
    }
    
}
