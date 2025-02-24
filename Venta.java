package com.concesionario.model;

public class Venta {
    private double monto;
    private Vehiculo vehiculo;
    private String apellido;
    private String nombre;
    private String documento;

    // Constructor
    public Venta(double monto, Vehiculo vehiculo, String apellido, String nombre, String documento) {
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // Método toString para imprimir la información de la venta
    @Override
    public String toString() {
        return "Venta: " + vehiculo + " - Comprador: " + nombre + " " + apellido + " (Documento: " + documento + ") - Monto: $" + monto;
    }
}