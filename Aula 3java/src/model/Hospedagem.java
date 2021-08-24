            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab01
 */
public class Hospedagem {
    private int id;
    private int horai;
            private int horaf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorai() {
        return horai;
    }

    public void setHorai(int horai) {
        this.horai = horai;
    }

    public int getHoraf() {
        return horaf;
    }

    public void setHoraf(int horaf) {
        this.horaf = horaf;
    }
             public int totalHoras ( int horai, int horaf){
                 return horaf-horai;
                 
             }
             public double valorTotalHospedagem (int totalh, double Valor){
                 //total de horas que a pessoa passou no quarto e o valor
                 return totalh*Valor;
             }
}
