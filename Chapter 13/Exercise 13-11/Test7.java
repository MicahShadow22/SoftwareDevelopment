public class Test7 extends Octagon {
    public static void main(String[] args) {
        Octagon blue = new Octagon();
        Octagon red = (Octagon)blue.clone();
        int compared = blue.compareTo(red);
        if(compared == 0){
            System.out.println("it is equal");
        }
        
        else{
            System.out.println("It's not equal");
        }
    
    }
    
}
