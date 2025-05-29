public class Sinif {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setMarka("Toyota");
        araba.setModel("Corolla");
        araba.setKapiSayisi(4);

        System.out.println("Araba Markası: " + araba.getMarka());
        System.out.println("Araba Modeli: " + araba.getModel());
        araba.hareketEt();      }   }

