/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

import java.util.ArrayList;

/**
 *
 * @author vnord
 */
public interface DogListI {
    public ArrayList<Dog> dogList(String sourcename);
    public void printList(int limit);
}
