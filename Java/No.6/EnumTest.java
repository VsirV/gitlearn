package enums;

import java.util.Scanner;

/**
 * Created by daihongyang on 2017/10/25.
 */
public class EnumTest
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("Size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size ==Size.Extra_LARGE)
            System.out.println("Good job--you paid attention to the _.");
    }
}


enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");


    private Size(String abbreviation) {this.abbreviation = abbreviation;}
    public String getAbbreviation() {return abbreviation;}

    private String abbreviation;
}
