package collectionAPI;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

//ds-hashtable
//duplicate not allow
//insertion order not preserve
//heterogenius is allowed
//null is allowed
//multiple null is not allowed
//16
//searching

        public static void main(String[] args) {

            HashSet set=new HashSet();

//System.out.println(set.add(12));//true

//System.out.println(set.add(12));//false
            set.add(22);//true
            set.add("Sunil");//true
            // System.out.println(set.add(null));//true
            set.add(null);//false
            //	System.out.println(set);

            Iterator it=set.iterator();
            while(it.hasNext())
            {
                System.out.println(
                        it.next
                                ());

            }



        }
    }


