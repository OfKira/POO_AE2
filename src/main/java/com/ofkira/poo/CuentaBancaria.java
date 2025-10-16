package com.ofkira.poo;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
        this.titular = "Titular Generico";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular no puede quedar vacío.");
        }
        this.titular = titular.trim();
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.trim().length() < 6) {
            throw new IllegalArgumentException("Número de cuenta debe tener al menos 6 dígitos.");
        }
        this.numeroCuenta = numeroCuenta.trim();
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("Saldo no puede ser negativo.");
        this.saldo = saldo;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto a depositar debe ser mayor que 0.");
            return false;
        }
        this.saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto a retirar debe ser mayor que 0.");
            return false;
        }
        if (this.saldo >= monto) {
            this.saldo -= monto;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
