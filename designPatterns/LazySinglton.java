package designPatterns;
public class LazySinglton {
    public static LazySinglton instance;
    private LazySinglton(){
    }

    public LazySinglton getInstance() {
        if(instance==null){
            instance = new LazySinglton();
        }
        return instance;
    }

    public String returnString() {
        return "Here is the method ";
    }

    public static void main(String[] args) {
        LazySinglton lazySinglton1 = new LazySinglton().getInstance(); // method called when the getInstance is called
        System.out.println(lazySinglton1.returnString());
    }

}