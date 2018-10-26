import java.util.Arrays;

public class Runner {
    public static void main(String[] args)
    {
        String[][] faceFeatures = new String[8][5];
        JackOLantern jack = new JackOLantern(faceFeatures);
        jack.toString();
        jack.fill("x");

    }
}
