/**
 * Created by suneth on 12/15/2017.
 */
public class templateSelector {
    String filepath;


    public templateSelector(String template) {
        int file = Integer.parseInt(template);

        filepath ="./template/"+file+".xml";


    }
}
