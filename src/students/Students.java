package students;

/**
 * Created by venkatasaiharsharavuri on 5/17/17.
 */
public class Students {
    private String stdID;
    private String classification;
    private String name;
    private Double gpa;
    public Students (String stdID, String classification, String name, Double gpa){
        this.stdID = stdID;
        this.classification = classification;
        this.name = name;
        this.gpa = gpa;
    }
    public String getFirstName(){
    if (name.indexOf(" ") == -1){
        return name;
    }else {
        return name.substring(0,name.indexOf(" "));
    }
    }
    public String getfirstNameReversed()
    {
        String firstName = getFirstName();
        String firstNameReversed = "";
        for (int i=0; i<firstName.length(); i++){
            firstNameReversed += firstName.charAt(firstName.length()-1-i);
        }
        return firstNameReversed;
    }
    public Integer getNameCount(){
        Integer nameCount = 1;
        String tempName = name;
        while (tempName.indexOf(" ") != -1){
            nameCount++;
            tempName = tempName.substring(tempName.indexOf(" ") +1);
        }
        return nameCount;
    }
    public String getname(Integer N){
        String str = "";
        if (N > getNameCount()-1)
        {
         return "None";
        }else {
            str = name;
            for (int i=0; i < N; i++){
                if (str.indexOf(" ") != -1){
                    str = str.substring(str.indexOf(" ")+1);
                }
            }
            if (str.indexOf(" ")== -1){
                return str;
            }else {
                return str.substring(0,str.indexOf(" "));
            }
        }
        }
        @Override
    public String toString()
        {
            return String.format("%-5s %4.2f %-11s %-32s", stdID, gpa, classification, name);
        }
    }

