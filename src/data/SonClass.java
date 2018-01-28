package data;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by zhouyang on 2017/9/11.
 */
public class SonClass extends FatherClass {
    private String mSonName;
    protected int mSonAge;
    public String mSonBirthday;
    public  void printSonMsg(){
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    public String getmSonName() {
        return mSonName;
    }

    public void setmSonName(String mSonName) {
        this.mSonName = mSonName;
    }

    public int getmSonAge() {
        return mSonAge;
    }

    public void setmSonAge(int mSonAge) {
        this.mSonAge = mSonAge;
    }

    public String getmSonBirthday() {
        return mSonBirthday;
    }

    public void setmSonBirthday(String mSonBirthday) {
        this.mSonBirthday = mSonBirthday;
    }

    private static void printFileds(){
        Class mClass = SonClass.class;
        System.out.println(mClass.getName());
        Field[] fields = mClass.getFields();
        for(Field field:fields){
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println(field.getType().getName()+","
            +field.getName());
        }
    }
    public static void main(String [] args){
        printFileds();
    }
}
