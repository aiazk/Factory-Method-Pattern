public class Testing{
    public static void main(String[] args){
        Orcish spearwep = new Spear();
        doStuffWeap(spearwep);
        Orcish axewep = new Axe();
        doStuffWeap1(axewep);
        Elven spearweap1 = new Spear1();
        doStuffWeap2(spearweap1);
        Elven shortsword = new ShortSword();
        doStuffWeap3(shortsword);
    }
public static void doStuffWeap(Orcish anOrcish){
    anOrcish.displayOrcish();
    
}
public static void doStuffWeap1(Orcish anOrcish){
    anOrcish.displayOrcish1();
}

public static void doStuffWeap2(Elven anElven){
    anElven.displayElven();
}
  public static void doStuffWeap3(Elven anElven){
    anElven.displayElven1();
}
  
}
