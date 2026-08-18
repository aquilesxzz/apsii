
package primeiroexemplo;
public class Principal {
    public static void main(String[] args){
        Banco b1 = new Banco("Aquiles", "00000",15);
        Banco b2 = new Banco();
        Banco b3 = new Banco("Joao","0001", 24);


        System.out.println(b3.getNome());
        b3.setNome("Rafel");
        System.out.println(b3.getNome());
    }
}
