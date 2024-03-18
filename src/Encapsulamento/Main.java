package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(20.0);
        System.out.println("autonomia: "+carro.autonomia()+"por km");
        carro.percorrerDistancia(200);
        System.out.println("quilometragem: "+carro.getQuilometragem()+"km");
        System.out.println("combustivel: "+carro.getCombustivel()+"litros");
        carro.abastecer(80.0);
        System.out.println("autonomia depois de abastecer: "+carro.autonomia()+"por km");





    }
}