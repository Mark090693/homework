package by.yakovlev;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Введите текст:");
        StringBuilder temporaryText = new StringBuilder();

        String[] words = text.split(" ");
        text = text.replaceAll("-?[0-9]+[.,!?;:-]", "");

        for (String word : words) {
            temporaryText.append(word.charAt(word.length() - 1));
        }

        JOptionPane.showMessageDialog(null, "Текст из последних букв: " + temporaryText);
    }
}
