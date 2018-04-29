package com.pluralsight.builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

//        LunchOrderBean lunchOrderBean = new LunchOrderBean();
//
//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");
//
//        System.out.println("lunchOrderBean.getBread() = " + lunchOrderBean.getBread());
//        System.out.println("lunchOrderBean.setCondiments() = " + lunchOrderBean.getCondiments());
//        System.out.println("lunchOrderBean.getDressing() = " + lunchOrderBean.getDressing());
//        System.out.println("lunchOrderBean.getMeat() = " + lunchOrderBean.getMeat());

        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println("lunchOrderTele.getBread() = " + lunchOrderTele.getBread());
        System.out.println("lunchOrderTele.getCondiments() = " + lunchOrderTele.getCondiments());
        System.out.println("lunchOrderTele.getDressing() = " + lunchOrderTele.getDressing());
        System.out.println("lunchOrderTele.getMeat() = " + lunchOrderTele.getMeat());
        
    }

}
