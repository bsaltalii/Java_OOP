/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;
/**
 *
 * @author ÖMER
 */

public class Party {
    public String name;
    public int partyID;
    public int totalNumberOfVotes=0;

    public Party(String name,int partyID)
    {
        this.name=name;
        this.partyID=partyID;
    }
    @Override
    public String toString(){
        String all = ("Party ID : " +this.partyID + " Party Name : "+this.name+ " Number of Votes: "+ this.totalNumberOfVotes);
        return all;
    }
}

