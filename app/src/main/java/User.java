/**
 * Created by asmma on 3/13/2018.
 */

public class User {
    public static String USER_NAME = "UserName";
    public static String USER_GENDER = "UserGender";
    public static String USER_SKILLPOINTS = "SkillPoints";
    public String name;
    public boolean gender;
    public int skillPoints;

    public User (String name, boolean gender){
        this.name = name;
        this.gender = gender;
        this.skillPoints = 0;
    }


}

