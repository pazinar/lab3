package smoking.kills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Parcer {
    FileInputStream stream;
    Parcer() throws FileNotFoundException{
        stream = new FileInputStream("Text.txt");
    }
    String[] strings = { "���� ", "���� ", "��� ", "��� ", "��� ", "������ ",
            "���� ", "����� ", "���� ", "������ ", "������ ", "������ ",
            "����������� ", "���������� ", "���������� ", "������������ ",
            "���������� ", "����������� ", "���������� ", "������������ ",
            "������������ ", "�������� ", "�������� ", "����� ", "��������� ",
            "���������� ", "��������� ", "����������� ", "��������� ", "��� ",
            "������ ", "������ ", "��������� ", "������� ", "�������� ",
            "������� ", "��������� ", "��������� ", "������ ", "������ ",
            "����� ", "������� ", "��������� ", "�������� " };
    // String input = new String(
    //  " ��� ��������� ���� �������� ���� ��������� ������ �������  ��� ���� ");
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
        if (s.equals("���� ") || s.equals("���� "))
            i++;
        else if (s.equals("��� ") || s.equals("��� "))
            i += 2;
        else if (s.equals("��� "))
            i += 3;
        else if (s.equals("������ "))
            i += 4;
        else if (s.equals("���� "))
            i += 5;
        else if (s.equals("����� "))
            i += 6;
        else if (s.equals("���� "))
            i += 7;
        else if (s.equals("������ "))
            i += 8;
        else if (s.equals("������ "))
            i += 9;
        else if (s.equals("������ "))
            i += 10;
        else if (s.equals("����������� "))
            i += 11;
        else if (s.equals("���������� "))
            i += 12;
        else if (s.equals("���������� "))
            i += 13;
        else if (s.equals("������������ "))
            i += 14;
        else if (s.equals("���������� "))
            i += 15;
        else if (s.equals("����������� "))
            i += 16;
        else if (s.equals("���������� "))
            i += 17;
        else if (s.equals("������������ "))
            i += 18;
        else if (s.equals("������������ "))
            i += 19;
        else if (s.equals("�������� "))
            i += 20;
        else if (s.equals("�������� "))
            i += 30;
        else if (s.equals("����� "))
            i += 40;
        else if (s.equals("��������� "))
            i += 50;
        else if (s.equals("���������� "))
            i += 60;
        else if (s.equals("��������� "))
            i += 70;
        else if (s.equals("����������� "))
            i += 80;
        else if (s.equals("��������� "))
            i += 90;
        else if (s.equals("��� "))
            i += 100;
        else if (s.equals("������ "))
            i += 200;
        else if (s.equals("������ "))
            i += 300;
        else if (s.equals("��������� "))
            i += 400;
        else if (s.equals("������� "))
            i += 500;
        else if (s.equals("�������� "))
            i += 600;
        else if (s.equals("������� "))
            i += 700;
        else if (s.equals("��������� "))
            i += 800;
        else if (s.equals("��������� "))
            i += 900;
        else if (s.equals("������ ") || s.equals("����� ")
                || s.equals("������"))
            i *= 1000;
        else if (s.equals("�������� ") || s.equals("������� ")
                || s.equals("��������� "))
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
        s=s.concat(" ���� ���� ");
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