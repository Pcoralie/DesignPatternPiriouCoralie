package edu.insightr.gildedrose;

public class ItemB extends Item {

    @Override
    public void accept( IVisitor v ){
        v.visit(this);
    }
}
