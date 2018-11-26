package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {

    @Override
    public void visit( ElixirItem a ){
        System.out.println("Update ElixirItem");
    }

    @Override
    public void visit(SulfurasItem b ){
        System.out.println("Update Sulfuras");
    }

    @Override
    public void visit(AgedBrieItem  b ){

        System.out.println("Update AgedBrie");
    }

    @Override
    public void visit(BackstageItem  b ){

        System.out.println("Update Backstage");
    }

    @Override
    public void visit(ConjuredItem  b ){

        System.out.println("Update Conjured");
    }

    @Override
    public void visit(DexterityItem  b ){

        System.out.println("Update Dexterity");
    }


}
