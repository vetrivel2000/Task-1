/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package task1.sortarray;
import java.util.*;
public class SortAnArray {
    public void sort(int array[],int size)
    {
        Arrays.sort(array);
        for(int i=0;i<size;i++)
        {
           System.out.print(array[i]+" ");
        }
    }
}
