package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {

    @Override
    public void visit( ElixirItem a ){
        System.out.println("Update ElixirItem");
    }

    @Override
    public void visit(Sulfuras b ){
        System.out.println("Update Sulfuras");
    }
}
