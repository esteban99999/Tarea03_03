/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class CarreraServiceImpl implements CarreraService{

       public static List<Carrera> carreraList=new ArrayList<>();

public CarreraServiceImpl(){


}
    @Override
    public void crear(Carrera carrera) {
        this.carreraList.add(carrera);
    }
    

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }


    public Carrera buscaCodigo(int codigo) {
        Carrera retorno = null;
        for (Carrera carrera : this.carreraList) {
            if (codigo == carrera.getCodigo()) {
                retorno = carrera;
                break;

            }
        }
        return retorno;
    }
    
}
