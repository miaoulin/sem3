package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int[] a, int low, int high){
    if (a.length == 0 ) return;
    if (low < high) {
      int p = low + (high - low)/2;
      int middle = a[p];
      int beg = low;
      int end = high;
      while (beg <= end){
        while(a[beg] < middle) beg++;
        while(middle < a[end]) end--;

        if (beg <= end) {
          int h = a[beg];
          a[beg] = a[end];
          a[end] = h;
          beg++;
          end--;
        }
      }
      if (low < end) sort(a,low,end);
      if (beg < high) sort(a,beg,high);
    }
    else return;
  }

  public static void sort (List<Integer> list) {Collections.sort(list);}
}
