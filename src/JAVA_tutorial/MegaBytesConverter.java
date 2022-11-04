package JAVA_tutorial;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int mega = kiloBytes/1024;
            int rnd = kiloBytes % 1024;
            System.out.println(""+kiloBytes +" KB = "+mega+" MB and "+rnd+" KB");
        }
    }
}