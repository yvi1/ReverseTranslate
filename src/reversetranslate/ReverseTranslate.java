/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversetranslate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yvi1
 */
public class ReverseTranslate {

    private static final String PROTEIN = "MTYSRSNITLALLANICAFFLWSLATLIFNALSTIDNLQVLAFRIIFSMM";
    
    // Map to store the amino acids to codons sequences
    private static final Map<String,String> REVERSE_TRANSLATION = new HashMap<String,String>();
    
    // Codons to translate
    private static final String[] CODONS = { "ATT", "CTT", "GTT", "TTT", "ATG", "TGT", "GCT",
                                             "GGT", "CCT", "ACT", "TCT", "TAT", "TGG", "CAA",
                                             "AAT", "CAT", "GAA", "GAT", "AAA", "CGT"
    };
    
    // Amino acids in Map
    private static final String[] AMINO_ACIDS = { "I", "L", "V", "F", "M", "C", "A",
                                                  "G", "P", "T", "S", "Y", "W", "Q",
                                                  "N", "H", "E", "D", "K", "R",
    };

    // Initialize the Map
    private static void init() {
      for(int i=0; i<AMINO_ACIDS.length; i++)
        REVERSE_TRANSLATION.put(AMINO_ACIDS[i], CODONS[i]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        StringBuffer nucleotideSequence;
        nucleotideSequence = new StringBuffer();
        int i = 0;
        while(i<PROTEIN.length()) {
            nucleotideSequence.append(REVERSE_TRANSLATION.get(PROTEIN.substring(i, i+1)));
            i++;
        }
    
    System.out.println("Original protein sequence: " + PROTEIN);
    System.out.println("Reverse-translated sequence: " + nucleotideSequence);
    }
}
