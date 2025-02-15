import java.util.Random;
public class StationSimulation {
    public static void main (String[] args) {
        int min = 1;
        int max = 15;
        
        Vehicle[] v = new Vehicle[10];        
        for (int i = 0; i < 10; i++) {
            int l = (int) (Math.random() * (max - min + 1)) + min;
            int b = (int) (Math.random() * (max - min + 1)) + min;
            int w = (int) (Math.random() * (max - min + 1)) + min;
            
            v[i] = new Vehicle(l,b,w);
            System.out.println(v[i]);
        }
    }
}