/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import javax.swing.plaf.PanelUI;

/**
 *
 * @author ÖMER
 */
public class Turkish extends Person{

    public Turkish(){}
    public Turkish(String name,int age){
        super(name,age);
    }

    public String toString(){
        String all = ("Name : " + this.name + " Age : "+ this.age+" Voting State : "+this.votedBefore);
        all += (" Citizenship Status : Turkish");
        return all;
    }
}

