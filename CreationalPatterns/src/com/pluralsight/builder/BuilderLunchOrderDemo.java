package com.pluralsight.builder;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

        LunchOrder lunchOrder = builder.build();

        System.out.println("lunchOrder.getBread() = " + lunchOrder.getBread());
        System.out.println("lunchOrder.getCondiments() = " + lunchOrder.getCondiments());
        System.out.println("lunchOrder.getDressing() = " + lunchOrder.getDressing());
        System.out.println("lunchOrder.getMeat() = " + lunchOrder.getMeat());
    }
}
