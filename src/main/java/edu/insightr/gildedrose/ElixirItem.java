package edu.insightr.gildedrose;

public class ElixirItem extends Item{

    public ElixirItem(){
        super();
    }

    public ElixirItem(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept( IVisitor v ){
        v.visit(this);
    }


}
