import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        String[][] people ={
                {"Sarah", "34", "english", "f"},
                {"Linda", "23", "spanish", "f"},
                {"Amelie", "3", "german", "f"},
                {"Sven", "31", "swedish", "m"},
                {"Maurice", "72", "french", "m"},
                {"Patrick", "21", "german", "m"},
                {"Rosa", "17", "german", " "}
        };



        ArrayList <Male> maleObjectList = new ArrayList<Male>();
        ArrayList <Female> femaleObjectList = new ArrayList<Female>();

        for (String[] person : people) {

            if (person[person.length - 1] == "f") {
                femaleObjectList.add(new Female(person[0], person[1], person[2]));


            }else if (person[person.length-1] == "m") {
                maleObjectList.add(new Male(person[0], person[1], person[2]));
            }
            else{
                System.out.println(String.format("Gender not found %s", person[0]));
            }
        }




        for (Female female : femaleObjectList) {
            female.getChromosomes();

        }

        for (Male male : maleObjectList){
            male.getChromosomes();
        }








    }
}
