package edu.insightr.gildedrose;

public interface IVisitor {

    public void visit( ElixirItem elixir);
    public void visit( SulfurasItem sulfuras );
    public void visit( ConjuredItem conjured);
    public void visit(AgedBrieItem agedBrie);
    public void visit(BackstageItem backstage);
    public void visit(DexterityItem dexterity);


}
