class Barang
{
    public int id;
    public String nama;
    public int harga;

    public Barang(int ids, String namas, int hargas)
    {
        this.id = ids;
        this.nama = namas;
        this.harga = hargas;
    }
}



public class InventoriDevcom
{
    static void print(Barang[] barangs)
    {
        for (int i=0; i<5; i++)
            {
                System.out.printf
                (
                "id : %d\nnama : %s\nharga : %d\n\n",
                barangs[i].id,
                barangs[i].nama,
                barangs[i].harga  
                );
            }
    }
    public static void main(String[] args)
    {
        Barang[] barangs = new Barang[5];
        String[] namaBarang = {"shampo", "sabun", "sendal", "sepatu", "sendok"};
        int[] hargaBarang = {1000, 2000, 3000, 4000, 5000};
        for (int i=0; i<5; i++)
        {
            barangs[i] = new Barang(i, namaBarang[i], hargaBarang[i]);
        }

        print(barangs);
    }
}