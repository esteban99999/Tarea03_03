/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class AsignaturaServiceImpl implements  AsignaturaService{
public static List<Asignatura> asiganturaList;

public AsignaturaServiceImpl (){
this.asiganturaList=new ArrayList<>();
}

    @Override
    public void crear(Asignatura asignatura) {
        this.asiganturaList.add(asignatura);
    }

    @Override
    public List<Asignatura> listar() {
        return this.asiganturaList;
    }
    
}
