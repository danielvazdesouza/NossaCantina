/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.senac.exceptions;

/**
 *
 * @author Daniel
 */
public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(){
        super("Verifique a senha");
    }
}
