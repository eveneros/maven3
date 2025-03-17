/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import model.Cliente;
import model.Empleado;
/**
 *
 * @author eveneros
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@example.com", "123456789");
        cliente.insertar(cliente);
        cliente.actualizar(cliente);
        cliente.eliminar(1);
        System.out.println("Clientes: " + cliente.listar());

        // Crear un empleado
        Empleado empleado = new Empleado(2, "Ana Gomez", "Gerente", 3000.0);
        empleado.insertar(empleado);
        empleado.actualizar(empleado);
        empleado.eliminar(2);
        System.out.println("Empleados: " + empleado.listar());
    }
}
