/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Universidad;
import java.util.List;

/**
 *
 * @author esteb
 */
public interface UniversidadService {
    
    public Universidad buscarCodigo(int codigo);
    public void crear(Universidad universidad);
    public List<Universidad> listar();
    
    
}
