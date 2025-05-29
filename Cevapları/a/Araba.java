class Araba extends Arac {
    private int kapiSayisi;

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void hareketEt() {
        System.out.println("Araba yolda hareket ediyor.");
    }
}