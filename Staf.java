
package polimorphism;

public class Staf extends Pegawai{
    
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;
    String nama;
    
    Staf(){
        
    }
    
    Staf (String nm){
        this.nama = nm;
        System.out.println("Nama Staf\t : " +nm);
    }
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    
    public int bonus(){
        return bonusStaf;
    }
    
}
