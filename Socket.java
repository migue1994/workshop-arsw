import java.net.Socket;

public class Socket extends Exception{
    public static void main(String args[]){
        try{
            Socket mySocket = Socket("127.0.0.1", 35000);
        }catch(Exception e){
            System.out.print(e);
        }
    }
}