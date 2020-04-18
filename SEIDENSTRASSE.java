public class SEIDENSTRASSE{
    GRAPH_MATRIX m1 = new GRAPH_MATRIX(10);
    
    public SEIDENSTRASSE(){
    }
    
    private void KnotenInMatrixEinfuegen(){
        m1.KnotenEinfuegen("Kon");
        m1.KnotenEinfuegen("Kai");
        m1.KnotenEinfuegen("Pal");
        m1.KnotenEinfuegen("Kas");
        m1.KnotenEinfuegen("Kuc");
        /*
        m1.KnotenEinfuegen("Dun");
        m1.KnotenEinfuegen("Anx");
        m1.KnotenEinfuegen("Cha");
        m1.KnotenEinfuegen("Pek");
        m1.KnotenEinfuegen("Han");
        */
    }    
        
    private void KantenInMatrixEinfuegen(){
        m1.KanteEinfuegen("Kon","Pal", 17);
        m1.KanteEinfuegen("Pal","Kon", 17);
        
        m1.KanteEinfuegen("Kai","Pal", 18);
        m1.KanteEinfuegen("Pal","Kai", 18);
        
        m1.KanteEinfuegen("Pal","Kas", 61);
        m1.KanteEinfuegen("Kas","Pal", 61);
        
        m1.KanteEinfuegen("Kas","Kuc", 19);
        m1.KanteEinfuegen("Kuc","Kas", 19);
        
        m1.KanteEinfuegen("Kas","Dun", 33);
        m1.KanteEinfuegen("Dun","Kas", 33);
        
        m1.KanteEinfuegen("Kuc","Dun", 22);
        m1.KanteEinfuegen("Dun","Kuc", 22);
        
        m1.KanteEinfuegen("Kuc","Anx", 16);
        m1.KanteEinfuegen("Anx","Kuc", 16);
        
        m1.KanteEinfuegen("Dun","Anx", 2);
        m1.KanteEinfuegen("Anx","Dun", 2);
        
        m1.KanteEinfuegen("Anx","Cha", 19);
        m1.KanteEinfuegen("Cha","Anx", 19);
        
        m1.KanteEinfuegen("Cha","Pek", 12);
        m1.KanteEinfuegen("Pek","Cha", 12);
        
        m1.KanteEinfuegen("Cha","Han", 14);
        m1.KanteEinfuegen("Han","Cha", 14);
        
        
        
    }
    
    public void StrasseBauenUndTesten(){
        KnotenInMatrixEinfuegen();
        m1.MatrixAusgeben();
        System.out.println("Knoten in Matrix eingefügt");
        System.out.println();
        
        KantenInMatrixEinfuegen();
        m1.MatrixAusgeben();
        System.out.println("Kanten in Matrix eingefügt");            
        System.out.println();               
        
        m1.KanteEinfuegen("Umm", "Gua", 80);
        m1.KanteEinfuegen("Umm", "Oce", 81);
        m1.KanteEinfuegen("Umm", "Mac", 82);
        
        m1.MatrixAusgeben();
        System.out.println("Um Seewege erweitert");
        System.out.println();
        
        System.out.println("Weg von Palmyra nach Hangzhou mit Seewegen");
        m1.WegeSuchen("Pal","Han"); 
        System.out.println();
        
        m1.KanteLoeschen("Anx", "Cha");
        m1.MatrixAusgeben();
        System.out.println("Kante zwischen Anxi und Chang'an wirklich entfernt");
        System.out.println();
        
        System.out.println("Weg von Palmyra nach Hangzhou ohne Kante zwischen Anxi und Chang'an ");
        m1.WegeSuchen("Pal","Han");
        
        //$ Ändern vor Abgabe
        System.out.println();
        m1.KanteAendern("Umm", "Pal", 42);
        m1.KanteAendern("Cha", "Pek", 33);
       
        m1.MatrixAusgeben();
        
        System.out.println();
        System.out.println(m1.KnotenEntfernen_2("Pal"));
        m1.MatrixAusgeben();
        System.out.println();
    }
}