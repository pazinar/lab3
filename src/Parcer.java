

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Parcer {
    String[] strings = { "���� ", "���� ", "��� ", "��� ", "��� ", "������ ",
            "���� ", "����� ", "���� ", "������ ", "������ ", "������ ",
            "����������� ", "���������� ", "���������� ", "������������ ",
            "���������� ", "����������� ", "���������� ", "������������ ",
            "������������ ", "�������� ", "�������� ", "����� ", "��������� ",
            "���������� ", "��������� ", "����������� ", "��������� ", "��� ",
            "������ ", "������ ", "��������� ", "������� ", "�������� ",
            "������� ", "��������� ", "��������� ", "������ ", "������ ",
            "����� ", "������� ", "��������� ", "�������� " };
    int tempInt, superTempInt;
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
    public static void main(String[] args){

    }
}