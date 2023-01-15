abstract class multivers{
    multivers(){}
    abstract void formapelea();
    abstract void puñetaso();
    abstract void telarañas();
    abstract void patadas();
    abstract void remate();
}

class Spiderman extends multivers {
        void formapelea() {
        System.out.println("\nPasivo, con astucia y analizitivo");
        }
        void puñetaso() {
        System.out.println("Lanza un punetaso a la cara leve, lo suficiente para mandar al suelo al sujeto de pelea");
        }
        void telarañas(){
            System.out.println("Recien se levanta lanza una telarana para columpiarse");
        }
        void patadas(){
            System.out.println("Lanza unas patadas dobles");
        }
        void remate(){
            System.out.println("Lo envuelve en una telarana y lo deja colgado");
        }
    }

    class Porkispider extends multivers{
        void formapelea() {
            System.out.println("Chistosa y calmada");
        }
        void puñetaso() {
            System.out.println("Da 2 golpes para mandarlo al cielo");
        }
        void telarañas() {
            System.out.println("Hace una resortera gigante con las telaranas para inpulsarse con el ladron");
        }
        void patadas() {
            System.out.println("Desde arriba pone las piernas y lo empuja hacia el pido ");
        }
        void remate() {
            System.out.println("Le deja caer su mazo");
        }
    }

    class Spider2099 extends multivers{

        @Override
        void formapelea() {
            System.out.println("Violento");
        }
        void puñetaso() {
            System.out.println("Le da un golpe tremendamente violento");
        }
        void telarañas() {
            System.out.println("Lo atrae hacia el con la telarana");
        }
        void patadas() {
            System.out.println("Le pega una patada con una sola pierna y lo manda a volar");
        }
        void remate() {
            System.out.println("Le da tremendo golpe para que no se mueva y ahi se quede");
        }
    }


public class Multiverso extends Thread{
    public static void main(String[] args) {
        System.out.println("*Aparece un maleante robando una tienda*");

        try{
            Thread.sleep(500);
            multivers spiderman = new Spiderman();
            System.out.println("\n---Tareas.Spiderman---");
            spiderman.formapelea();
            spiderman.puñetaso();
            spiderman.telarañas();
            spiderman.patadas();
            spiderman.remate();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        try{
            Thread.sleep(1000);
            multivers porkispider = new Porkispider();
            System.out.println("\n---SpiderPorki---");
            porkispider.formapelea();
            porkispider.puñetaso();
            porkispider.telarañas();
            porkispider.patadas();
            porkispider.remate();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        try{
            Thread.sleep(1500);
            multivers spider2099 = new Spider2099();
            System.out.println("\n---Tareas.Spiderman 2099---");
            spider2099.formapelea();
            spider2099.puñetaso();
            spider2099.telarañas();
            spider2099.patadas();
            spider2099.remate();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

}
