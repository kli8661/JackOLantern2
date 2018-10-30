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
        jack.edit(" ",1,2);
        jack.edit(" ",1,5);
        jack.edit(" ",3,1);
        jack.edit(" ",3,2);
        jack.edit(" ",3,3);
        jack.edit(" ",3,4);
        jack.edit(" ",3,5);
        jack.edit(" ",3,6);
        String result = jack.toString();
        System.out.println(result);

    }
}
