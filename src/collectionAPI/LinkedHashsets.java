package collectionAPI;

import java.util.LinkedHashSet;

public class LinkedHashsets {
//ds-LikedList+Hashtable
//duplicate no
//insertion orer yes
//heterogenius yes
//null yes
//multiple no
//cache basedpp


    public class TestLinkedHasSet {
        public static void main(String[] args) {

            LinkedHashSet lset=new LinkedHashSet();
            lset.add("SaiLeela");
            lset.add("Ganesh");
            lset.add("Rameswar");
            lset.add(12);
            lset.add("SaiLeela");
            lset.add(null);
            lset.add(null);
            System.out.println(lset);


        }

    }
}
