public class Runner {
    public static void main(String[] args)
    {
        String[][] faceFeatures = new String[5][8];
        JackOLantern jack = new JackOLantern(faceFeatures);
        jack.fill("x");
        faceFeatures[0][0] = " ";
        faceFeatures[4][0] = " ";
        faceFeatures[0][7] = " ";
        faceFeatures[4][7] = " ";
        String result = jack.toString();
        jack.edit("*","1","3");
        System.out.println(result);

    }
}
