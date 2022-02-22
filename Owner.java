
package polimorphism;

public class Owner extends Pegawai{
    
    private static final int gajiOwn = 3000000;
    private static final int uangMakan = 10000000;
    String nama;
    
    Owner(){
        
    }
    
    Owner (String nm){
        this.nama = nm;
        System.out.println("Nama Owner\t : " +nm);
    }
    
    @Override
    public int gaji(){
        return gajiOwn;
    }
    
    public int makan(){
        return uangMakan;
    }
    
}
