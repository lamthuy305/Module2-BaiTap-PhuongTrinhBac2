package com.codegym;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double nghiemThuNhat() {
        return (-this.b + Math.sqrt(delta())) / (2 * this.a);
    }

    public double nghiemThuHai() {
        return (-this.b - Math.sqrt(delta())) / (2 * this.a);
    }

    public double nghiemKep() {
        return -this.b / (2 * this.a);
    }

}
