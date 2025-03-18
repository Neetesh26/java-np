import java.lang.*;
import java.util.*;

 class string_methods{
    public static void main(String[] args){
        String name= "neetesh";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,6));
        System.out.println(name.replace("e","a"));
        System.out.println(name.startsWith("nee"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("t"));
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.indexOf("e",5));
        System.out.println(name.equals("Neetesh"));
        System.out.println(name.equalsIgnoreCase("NeeteSH"));
        String nam= "     heyyyy";
        System.out.println(nam);
        System.out.println(nam.trim());
    } 
}