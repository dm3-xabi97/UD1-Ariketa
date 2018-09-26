/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ibilgailuak;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author DM3-2-11
 */
public class Kontroladorea {

    public static ObservableList<Ibilgailuak> DatuakSartu() {

        return FXCollections.observableArrayList(
                new Ibilgailuak("1","Astra", "Opel", "BI-2983-CF"),
                new Ibilgailuak("2","Megane", "Renault", "2988-XDF")
        );
    }
}
