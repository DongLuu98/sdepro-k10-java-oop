package lesson_06;

public class lab_64 {
    public static void main(String[] args) {
        String url = "https://google.com";

        if(url.contains("https")){
            System.out.println(" Secure protocol");
        } else if(url.contains("http")){
            System.out.println("Don't secure protocol");
        }
        //continue...

    }
}
