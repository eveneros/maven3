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

public class Cliente extends Persona implements IOperaciones<Cliente> {
    private String email;
    private String telefono;

    public Cliente(int id, String nombre, String email, String telefono) {
        super(id, nombre);
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void insertar(Cliente cliente) {
        // Lógica para insertar un cliente en la base de datos
        System.out.println("Cliente insertado: " + cliente.getNombre());
    }

    @Override
    public void actualizar(Cliente cliente) {
        // Lógica para actualizar un cliente en la base de datos
        System.out.println("Cliente actualizado: " + cliente.getNombre());
    }

    @Override
    public void eliminar(int id) {
        // Lógica para eliminar un cliente de la base de datos
        System.out.println("Cliente eliminado con ID: " + id);
    }

    @Override
    public List<Cliente> listar() {
        // Lógica para listar todos los clientes de la base de datos
        System.out.println("Listando clientes...");
        return List.of(this); // Ejemplo simplificado
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
