
package com.concesionario;

import com.concesionario.model.Vehiculo; // Importa la clase Vehiculo
import com.concesionario.service.Concesionario;

public class Main {
    public static void main(String[] args) {
        // Crear el concesionario
        Concesionario concesionario = new Concesionario();

        // Agregar vehículos al concesionario
        concesionario.agregarVehiculo(new Vehiculo("A001", "Toyota", "Auto", 2020, 15000));
        concesionario.agregarVehiculo(new Vehiculo("C002", "Ford", "Camioneta", 2019, 30000));
        concesionario.agregarVehiculo(new Vehiculo("M003", "Honda", "Motocicleta", 2021, 5000));

        // Listar vehículos disponibles
        System.out.println("Vehículos disponibles:");
        concesionario.listarVehiculos();

        // Realizar una venta
        concesionario.venderVehiculo("A001", 20000, "Pérez", "Juan", "12345678");

        // Listar ventas realizadas
        System.out.println("\nVentas realizadas:");
        concesionario.listarVentas();

        // Listar vehículos disponibles después de la venta
        System.out.println("\nVehículos disponibles después de la venta:");
        concesionario.listarVehiculos();
    }
}