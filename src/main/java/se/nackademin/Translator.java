
package se.nackademin;

/**
 *
 * @author vsanden
 */
public class Translator {
    public String getAdjektiv(int index){
        String[] adjektivArray = new String[10];
        adjektivArray[0] = "stor";
        adjektivArray[1] = "liten";
        adjektivArray[2] = "stark";
        adjektivArray[3] = "svag";
        adjektivArray[4] = "mjuk";
        adjektivArray[5] = "hård";
        adjektivArray[6] = "snabb";
        adjektivArray[7] = "vacker";
        adjektivArray[8] = "ljus";
        adjektivArray[9] = "mörk";
        return adjektivArray[index];
    }
    public String getSubstantiv(int index){
        String[] substantivArray = new String[10];
        substantivArray[0] = "en lönehöjning";
        substantivArray[1] = "en lönesänkning";
        substantivArray[2] = "en fotboja";
        substantivArray[3] = "en katt";
        substantivArray[4] = "en hund";
        substantivArray[5] = "ett hus";
        substantivArray[6] = "ett barn";
        substantivArray[7] = "ett elstängsel";
        substantivArray[8] = "en dator";
        substantivArray[9] = "ett golv";
        return substantivArray[index];
    }
    public String getVerb(int index){
        String[] verbArray = new String[10];
        verbArray[0] = "springa";
        verbArray[1] = "ljuga";
        verbArray[2] = "flyga";
        verbArray[3] = "se";
        verbArray[4] = "vara";
        verbArray[5] = "äta";
        verbArray[6] = "mäta";
        verbArray[7] = "gå";
        verbArray[8] = "röra";
        verbArray[9] = "resa";
        return verbArray[index];
    }
            
}
