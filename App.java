import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        auto();

    }

    public static void auto() throws Exception {
        Screen s = new Screen();
        s.find("userid.png");
        s.click("userid.png");
        s.type("your username");
        s.find("password.png");
        s.click("password.png");
        s.type("your password");
        s.find("ok.png");
        s.click("ok.png");
        TimeUnit.SECONDS.sleep(10);
        s.find("importorders.png");
        s.click("importorders.png");
        TimeUnit.SECONDS.sleep(10);
        s.find("import2.png");
        s.click("import2.png");
        TimeUnit.SECONDS.sleep(20);
        boolean complete = false;
        while(!complete) {
            try {
                TimeUnit.SECONDS.sleep(10);
                s.find("ok2.png");
                s.click("ok2.png");
                complete = true;
            } 
            catch (FindFailed E) {
                
                s.find("continue.png");
                s.click("continue.png");
                TimeUnit.SECONDS.sleep(15);
            }

        }
        TimeUnit.SECONDS.sleep(5);
        s.find("yahoo.png");
        s.click("yahoo.png");
        s.find("import2.png");
        s.click("import2.png");
        TimeUnit.SECONDS.sleep(20);
        complete = false;
        while(!complete){
            try {
                TimeUnit.SECONDS.sleep(10);
                s.find("ok2.png");
                s.click("ok2.png");
                complete = true;
            }
            catch (FindFailed E){
                
                s.find("continue.png");
                s.click("continue.png");
                TimeUnit.SECONDS.sleep(15);
            }
        }
        System.out.println("Complete");

    }
}
