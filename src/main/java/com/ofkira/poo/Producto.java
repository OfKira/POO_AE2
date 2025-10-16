package com.ofkira.poo;

public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Producto() {
        this.codigo = "P000";
        this.descripcion = "Producto Generico";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        setCodigo(codigo);
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Código requerido.");
        this.codigo = codigo.trim();
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? "" : descripcion.trim();
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 1) throw new IllegalArgumentException("Cantidad debe ser >= 1.");
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) throw new IllegalArgumentException("Precio unitario no puede ser negativo.");
        this.precioUnitario = precioUnitario;
    }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 50) {
            System.out.println("Porcentaje inválido (0-50%).");
            return false;
        }
        double descuento = calcularSubtotal() * (porcentaje / 100.0);
        double nuevoSubtotal = calcularSubtotal() - descuento;
        if (cantidad > 0) {
            this.precioUnitario = nuevoSubtotal / cantidad;
        }
        return true;
    }

    public boolean incrementarCantidad(int valor) {
        if (valor <= 0) {
            System.out.println("Valor a incrementar debe ser > 0.");
            return false;
        }
        this.cantidad += valor;
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
