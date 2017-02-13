/**
 * Created by niall-holloway on 13/02/17.
 */
import java.util.ArrayList;
    class DotCom {

    //make an arrayList
    private ArrayList<String> locationCells;
    private String name;

    void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    void setName(String n){
        name = n;
    }

    String checkYourself(String userInput){
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "Kill";
            }else {
                result = "Hit";
            }
        }
        return result;
    }

}
