package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {

  public static void sort (int[] a, int low, int high){
    if (a.length == 0) {
      return;
    }
    if (low < high) {
      int p = (a[low] + a[high])/2;
      int beg = low;
      int end = high;
      while (beg <= end){
        while(a[beg] < a[p]){
          ++beg;
        }
        while(a[p] <= a[end]){
          --end;
        }
        if (beg <= end) {
          int h = a[beg];
          a[beg] = a[end];
          a[end] = h;
          ++beg;
          --end;
        }
      }
      sort(a,low,end);
      sort(a,beg,high);
    }
  }

  public static void sort (List<Integer> list) {Collections.sort(list);}
}
