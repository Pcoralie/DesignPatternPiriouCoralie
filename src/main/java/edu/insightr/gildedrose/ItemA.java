package edu.insightr.gildedrose;

public class ItemA extends Item{

    @Override
    public void accept( IVisitor v ){
        v.visit(this);
    }


}
