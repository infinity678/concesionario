package com.concesionario.model;

public class Vehiculo {
    private String codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private int kilometraje;

    // Constructor
    public Vehiculo(String codigo, String marca, String tipo, int modelo, int kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Método toString para imprimir la información del vehículo
    @Override
    public String toString() {
        return tipo + " " + marca + " " + modelo + " (Código: " + codigo + ", Kilometraje: " + kilometraje + " km)";
    }
}