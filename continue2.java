// how to use continue
public class continue2 {
    public static void main(String []args){
        for(int i=1;i<=100;i++){
            if(i==50){
                continue;
            }
            if(i==50){
                break;
            }
            System.out.println(i);
            System.out.println("end");
        }
    }
}
