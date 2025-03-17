/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author eveneros
 */

import java.util.List;

public interface IOperaciones<T> {
    void insertar(T entidad);
    void actualizar(T entidad);
    void eliminar(int id);
    List<T> listar();
}