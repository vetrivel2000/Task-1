/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package task1.index;
public class IndexOfAnElement {
    public int findIndex(int array[],int size,int key){
        int i=0;
        while(i<size)
        {
            if(array[i]==key)   
                return i;
            else
               i++;
        }
        return 0;
    }
}
