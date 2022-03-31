public class NoteBook {

    private int price;
    private int ram;
    private String manufacturer;
    private int rating;

    public int getRating() {
        return rating;
    }

    /**
     * Метод, позволяющий установить рейтинг для производителя
     * @param manuf - массив производителей с рейтингом по убыванию
     * @param manuf1 - производитель
     */
    public void setRating(String[] manuf, String manuf1) {
        for (int i = 0; i < manuf.length; i++) {
            if(manuf[i].equals(manuf1)) this.rating = i;
        }
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    int getRam() {
        return ram;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
