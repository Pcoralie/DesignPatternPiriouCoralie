package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {

    @Override
    public void visit( ItemA a ){
        System.out.println("Update ItemA");
    }

    @Override
    public void visit(ItemB b ){
        System.out.println("Update ItemB");
    }
}
