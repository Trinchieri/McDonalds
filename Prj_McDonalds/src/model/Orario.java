package model;

class Orario {
    private int ora, minuti;

    public Orario(int ora, int minuti) throws Exception {
        if (ora < 0 || ora > 23) throw new Exception ("L'ora deve essere compresa tra 0 e 23");
        
        this.ora = ora;
        
        if (minuti < 0 || minuti > 59) throw new Exception ("L'ora deve essere compresa tra 0 e 23");
        
        this.minuti = minuti;
    }
    
}
