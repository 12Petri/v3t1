package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String defaultPin) {
        this.pinCode = defaultPin;
        this.safeFolder = new ArrayList<>();
    }

    public void changePin(String newPin) {
        this.pinCode = newPin;
    }

    public void addData(String data) {
        safeFolder.add(data);
    }

    public ArrayList<String> listData(String pin) {
        if (this.pinCode.equals(pin)) {
            return new ArrayList<>(safeFolder);
        }
        else {
            System.out.println("Väärä PIN-koodi!");
            return null;
        }
    }
}
