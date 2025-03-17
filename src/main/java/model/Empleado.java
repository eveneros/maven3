/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eveneros
 */

import interfaces.IOperaciones;
import java.util.List;

public class Empleado extends Persona implements IOperaciones<Empleado> {
    private String puesto;
    private double salario;

    public Empleado(int id, String nombre, String puesto, double salario) {
        super(id, nombre);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void insertar(Empleado empleado) {
        // Lógica para insertar un empleado en la base de datos
        System.out.println("Empleado insertado: " + empleado.getNombre());
    }

    @Override
    public void actualizar(Empleado empleado) {
        // Lógica para actualizar un empleado en la base de datos
        System.out.println("Empleado actualizado: " + empleado.getNombre());
    }

    @Override
    public void eliminar(int id) {
        // Lógica para eliminar un empleado de la base de datos
        System.out.println("Empleado eliminado con ID: " + id);
    }

    @Override
    public List<Empleado> listar() {
        // Lógica para listar todos los empleados de la base de datos
        System.out.println("Listando empleados...");
        return List.of(this); // Ejemplo simplificado
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
