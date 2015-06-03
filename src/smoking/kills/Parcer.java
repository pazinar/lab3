package smoking.kills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Parcer {
    FileInputStream stream;
    Parcer() throws FileNotFoundException{
        stream = new FileInputStream("Text.txt");
    }
    String[] strings = { "один ", "одна ", "два ", "две ", "три ", "четыре ",
            "п€ть ", "шесть ", "семь ", "восемь ", "дев€ть ", "дес€ть ",
            "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ",
            "п€тнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ",
            "дев€тнадцать ", "двадцать ", "тридцать ", "сорок ", "п€тьдес€т ",
            "шестьдес€т ", "семьдес€т ", "восемьдес€т ", "дев€носто ", "сто ",
            "двести ", "триста ", "четыреста ", "п€тьсот ", "шестьсот ",
            "семьсот ", "восемьсот ", "дев€тьсот ", "тыс€ча ", "тыс€чи ",
            "тыс€ч ", "миллион ", "миллионов ", "миллиона " };
    // String input = new String(
    //  " сто миллионов злых варваров ед€т п€тьдес€т дев€ть дураков  сто п€ть ");
    int tempInt, superTempInt;
    String tempString = new String();//do not use
    String superTempString = new String();
    String temp1string = new String(" ");

    static public String readTextFromInputStream(InputStream in) throws IOException{
        StringBuilder text = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        String newline = System.getProperty("line.separator");
        while ((line = reader.readLine())!=null){
            text.append(line);
            text.append(newline);
        }
        text.append(" ");
        return text.toString();
    }

    int shit(String s, int i) {
        if (s.equals("один ") || s.equals("одна "))
            i++;
        else if (s.equals("два ") || s.equals("две "))
            i += 2;
        else if (s.equals("три "))
            i += 3;
        else if (s.equals("четыре "))
            i += 4;
        else if (s.equals("п€ть "))
            i += 5;
        else if (s.equals("шесть "))
            i += 6;
        else if (s.equals("семь "))
            i += 7;
        else if (s.equals("восемь "))
            i += 8;
        else if (s.equals("дев€ть "))
            i += 9;
        else if (s.equals("дес€ть "))
            i += 10;
        else if (s.equals("одиннадцать "))
            i += 11;
        else if (s.equals("двенадцать "))
            i += 12;
        else if (s.equals("тринадцать "))
            i += 13;
        else if (s.equals("четырнадцать "))
            i += 14;
        else if (s.equals("п€тнадцать "))
            i += 15;
        else if (s.equals("шестнадцать "))
            i += 16;
        else if (s.equals("семнадцать "))
            i += 17;
        else if (s.equals("восемнадцать "))
            i += 18;
        else if (s.equals("дев€тнадцать "))
            i += 19;
        else if (s.equals("двадцать "))
            i += 20;
        else if (s.equals("тридцать "))
            i += 30;
        else if (s.equals("сорок "))
            i += 40;
        else if (s.equals("п€тьдес€т "))
            i += 50;
        else if (s.equals("шестьдес€т "))
            i += 60;
        else if (s.equals("семьдес€т "))
            i += 70;
        else if (s.equals("восемьдес€т "))
            i += 80;
        else if (s.equals("дев€носто "))
            i += 90;
        else if (s.equals("сто "))
            i += 100;
        else if (s.equals("двести "))
            i += 200;
        else if (s.equals("триста "))
            i += 300;
        else if (s.equals("четыресто "))
            i += 400;
        else if (s.equals("п€тьсот "))
            i += 500;
        else if (s.equals("шестьсот "))
            i += 600;
        else if (s.equals("семьсот "))
            i += 700;
        else if (s.equals("восемьсот "))
            i += 800;
        else if (s.equals("дев€тьсот "))
            i += 900;
        else if (s.equals("тыс€ча ") || s.equals("тыс€ч ")
                || s.equals("тыс€чи"))
            i *= 1000;
        else if (s.equals("миллиона ") || s.equals("миллион ")
                || s.equals("миллионов "))
            i *= 1000000;
        else return -1;
        return i;
    }

    int formTempInt(String s) {
        int temp = 0, notemp = 0;
        Pattern p = Pattern.compile("\\S.+?\\s");
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            tempString = matcher.group();
            temp = shit(tempString, temp);
            if (temp == -1)
                return -1;
            if (temp > 999) {
                notemp += temp;
                temp = 0;
            }
        }
        notemp += temp;
        //System.out.println(notemp);
        return notemp;

    }

    void temp() throws IOException{
        temp1(readTextFromInputStream(stream).concat(" "));
    }
    void temp1(String s){
        String string = new String();
        String substring = new String(s);
        s=s.concat(" ноль один ");
        boolean fuck;
        Pattern p = Pattern.compile("\\S.+?\\s");
        Matcher matcher = p.matcher(s);
        label1: while (matcher.find()) {
            superTempString = matcher.group();
            for (String c : strings){
                if (superTempString.equals(c)){
                    string = string.concat(superTempString);
                    continue label1;
                }
            }
            //System.out.println(string);
            superTempInt = formTempInt(string);
            if(superTempInt > 0){
                substring = substring.replaceAll(string, Integer.toString(superTempInt)+" ");
                string = "";
            }
        }
        superTempInt = formTempInt(string);
        if (superTempInt > 0)
            substring = substring.replaceAll(string, Integer.toString(superTempInt)+" ");
        System.out.println(substring);
    }
    void mega(String s){
        String substring = new String(s);
        String string = new String(" ");
        Pattern p = Pattern.compile("\\S.+?\\s");
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            superTempString = matcher.group();
            //System.out.println(superTempString);
            for (String c : strings){
                //System.out.println((superTempString.equals(c)));
                if (superTempString.equals(c)){
                    string = string.concat(superTempString);

                    break;
                }
                //System.out.println(c);
            }
        }
    }



    public static void main(String[] args) {
        try{
            Parcer j = new Parcer();
            j.temp();
        }
        catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            return;
        }
        catch (IOException e){
            System.out.println("IO");
            return;
        }
        // System.out.println(j.input);
    }

}