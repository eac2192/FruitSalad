
public class dist {

    public static void main(String[] args) {
    
        FruitGenerator f = new FruitGenerator();
        
        int[] array = f.generate(12, 12);
        
        double sum = 0.0;
        
        for (int i = 0; i < array.length; i++) {
        
            System.out.println((double) array[i] / 144.0);
            sum += (double) array[i] / 144.0;
        
        }
        System.out.println(sum);
    
    
    }


}
