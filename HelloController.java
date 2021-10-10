package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class HelloController {
    @FXML
    private TextField tfinput;
    @FXML
    private TextArea tfout;
    @FXML
    private Button btgo;
    @FXML
    private Button btwordFix;

    Dictionary dict = new Dictionary();

    public void dictionaryLookup() {
        String word = dictionarySearcher(tfinput.getText());
        String s = dict.lookWord(word);
        tfout.setText(s);
    }

    public String dictionarySearcher(String word) {
        String s = dict.searcher(word);
        if (s == "")
            System.out.println("....");
        return s;
    }


}