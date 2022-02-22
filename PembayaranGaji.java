
package polimorphism;

public class PembayaranGaji {
    
    public int hitungGaji (Pegawai peg){
        int uang = peg.gaji();
        
        if (peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
    
        if (peg instanceof Staf)
            uang += ((Staf)peg).bonus();
        
        if (peg instanceof Owner)
            uang += ((Owner)peg).makan();
            
        return uang;
    }
    
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        
        Staf ali = new Staf("Ali");
        System.out.println("gaji staf\t : " +pg.hitungGaji(ali));
        Direktur tony = new Direktur("Tony");
        System.out.println("gaji direktur\t : " +pg.hitungGaji(tony));
        Owner irwan = new Owner("Irwan");
        System.out.println("gaji owner\t : " +pg.hitungGaji(irwan));
    }
    
}
