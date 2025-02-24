package com.concesionario.service;

import com.concesionario.model.Vehiculo; // Importa la clase Vehiculo
import com.concesionario.model.Venta;   // Importa la clase Venta

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Vehiculo> vehiculos;
    private List<Venta> ventas;

    // Constructor
    public Concesionario() {
        this.vehiculos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    // Método para agregar un vehículo
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Método para vender un vehículo
    public void venderVehiculo(String codigoVehiculo, double monto, String apellido, String nombre, String documento) {
        Vehiculo vehiculo = null;
        for (Vehiculo v : vehiculos) {
            if (v.getCodigo().equals(codigoVehiculo)) {
                vehiculo = v;
                break;
            }
        }
        if (vehiculo != null) {
            Venta venta = new Venta(monto, vehiculo, apellido, nombre, documento);
            ventas.add(venta);
            vehiculos.remove(vehiculo);
            System.out.println("Venta realizada: " + venta);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    // Método para listar vehículos disponibles
    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos disponibles.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }
    }

    // Método para listar ventas realizadas
    public void listarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No se han realizado ventas.");
        } else {
            for (Venta venta : ventas) {
                System.out.println(venta);
            }
        }
    }
}