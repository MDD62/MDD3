class AkilliTelefon extends Telefon {
    private String isletimSistemi;
    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

    public void aramaYap() {
        System.out.println("Akıllı telefon internet üzerinden arama yapıyor.");
    }
}
